package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * 和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 */
@Component("txManager")
@Aspect
public class TransactionManager {
    @Autowired
    private ConnectionUtils connectionUtils;    //得到当前线程上的连接。

    @Pointcut("execution(* com.itheima.service.impl.*.*(..))")
    private void pt1(){}

    /**
     * 开启事务
     */
    //@Before("pt1()")
    public void beginThansaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
            System.out.println("开启事务执行");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 提交事务
     */
    //@AfterReturning("pt1()")
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
            System.out.println("提交事务执行");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 回滚事务
     */
    //@AfterThrowing("pt1()")
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
            System.out.println("回滚事务执行");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 释放连接
     */
    //@After("pt1()")
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();  //将连接还回连接池中
            connectionUtils.removeConnection();     //将线程与连接解绑
            System.out.println("连接释放");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //环绕通知
    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            //1.获取参数
            Object[] args = pjp.getArgs();
            //2.开启事务
            this.beginThansaction();
            System.out.println("开启事务....");
            //3.执行方法
            rtValue = pjp.proceed(args);
            //4.提交事务
            this.commit();
            System.out.println("提交事务....");
            //返回结果
            return rtValue;
        } catch (Throwable throwable) {
            //5.回滚事务
            this.rollback();
            System.out.println("回滚事务....");
            throwable.printStackTrace();
        }finally {
            //6.释放资源
            this.release();
            System.out.println("释放连接....");
        }
        return rtValue;
    }
}
