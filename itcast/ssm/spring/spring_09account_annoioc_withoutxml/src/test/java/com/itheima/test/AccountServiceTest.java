package com.itheima.test;

import config.SpringConfiguration;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 * spring整合junit的配置
 *      1.导入spring整合junit的jar(坐标)
 *      2.使用Junit提供的一个注解把原有的main方法替换了，替换成spring提供的
 *              @Runwith
 *      3.告知spring的运行器，spring和ioc创建是基于xml还是注释的，并且说明位置
 *              @ContextConfiguration
 *                  locations：指定xml文件的位置，加上classpath关键字，表示在类路径下
 *                  classes：指定注解所在的位置
 * 当我们使用spring 5.x 版本的时候，要求junit的版本必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    /*@Before
    public void init(){
        //1.获取容器
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2.得到业务层对象
        accountService = ac.getBean("accountService", AccountService.class);
    }*/
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
        account.setId(7);
        accountService.updateAccount(account);
    }
    @Test
    public void testDelete(){
        accountService.deleteAccount(7);
    }
}
