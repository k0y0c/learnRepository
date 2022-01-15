package com.itheima.jdbctemplate;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate使用ioc获取对象
 */
public class JdbcTemplate4 {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        //3.执行操作
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
        Account account1 = accountDao.findAccountByName("aaa");
        System.out.println(account1);

        Account account2 = new Account();
        account2.setMoney(1000000f);
        account2.setName("zzzzzzzz");
        account2.setId(13);
        accountDao.uptateAccount(account2);

        //2.获取对象
        AccountDao accountDao2 = ac.getBean("accountDao2", AccountDao.class);
        //3.执行操作
        Account account3 = accountDao2.findAccountById(1);
        System.out.println(account3);

    }
}
