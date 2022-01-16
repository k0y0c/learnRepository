package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        //AccountService accountService = new AccountServiceImpl();

        for (int i = 0; i < 5; i++) {
            AccountService accountService = (AccountService)BeanFactory.getBean("accountService");
            accountService.saveAccount();
        }

    }

}
