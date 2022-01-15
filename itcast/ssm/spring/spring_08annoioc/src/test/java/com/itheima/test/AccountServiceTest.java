package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 */
public class AccountServiceTest {
    AccountService accountService;
    @Before
    public void init(){
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.得到业务层对象
        accountService = ac.getBean("accountService", AccountService.class);
    }
    @Test
    public void testFindAll(){
        //3.执行方法
        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne(){
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave(){
        Account account = new Account();
        account.setMoney((float) 500);
        account.setName("kyc");
        accountService.saveAccount(account);
    }
    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setMoney((float) 5000);
        account.setName("kyc123");
        account.setId(6);
        accountService.updateAccount(account);
    }
    @Test
    public void testDelete(){
        accountService.deleteAccount(6);
    }
}
