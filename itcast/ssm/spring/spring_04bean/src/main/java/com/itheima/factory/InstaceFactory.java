package com.itheima.factory;

import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类(该类可能是存在于jar包中的，我们无法通过修改源码的方式提供默认构造函数)
 */
public class InstaceFactory {
    public AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
