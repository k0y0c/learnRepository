package com.itherma.test;

import com.itheima.dao.AccountDao;
import com.itheima.factory.BeanFactory;
import com.itheima.service.AccountService;
import org.junit.Test;

public class TestFactory {

    @Test
    public void test(){
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        accountService.saveAccount();
    }

    @Test
    public void test1(){
        AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
        accountDao.saveAccount();
    }

    public static void testStatic(){

    }

}
