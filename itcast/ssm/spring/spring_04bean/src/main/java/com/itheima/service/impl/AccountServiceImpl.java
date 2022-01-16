package com.itheima.service.impl;
import com.itheima.service.AccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    /*public AccountServiceImpl(String name){
        System.out.println("有参构造");
    }*/
    public AccountServiceImpl(){
        System.out.println("无参构造");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了...");
    }
    public void init() {
        System.out.println("对象初始化了...");
    }
    public void destory() {
        System.out.println("对象销毁了...");
    }
}
