package com.itheima.utils;

import java.sql.SQLException;

/**
 * 和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 */
public class TransactionManager {
    private ConnectionUtils connectionUtils;    //得到当前线程上的连接。
    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /**
     * 开启事务
     */
    public void beginThansaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
            System.out.println("开启事务....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 提交事务
     */
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
            System.out.println("提交事务....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 回滚事务
     */
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
            System.out.println("回滚事务....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 释放连接
     */
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();  //将连接还回连接池中
            connectionUtils.removeConnection();     //将线程与连接解绑
            System.out.println("释放连接....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
