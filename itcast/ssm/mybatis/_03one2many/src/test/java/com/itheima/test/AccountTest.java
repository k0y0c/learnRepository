package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountTest {
    private InputStream in ;
    private SqlSession sqlsession ;
    private AccountDao accountDao ;

    @Before     //用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产sqlSession对象
        //sqlsession = factory.openSession(true);
        sqlsession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        accountDao = sqlsession.getMapper(AccountDao.class);
    }

    @After      //用于在测试方法执行之后执行
    public void destroy() throws IOException {
        //提交事务
        //sqlsession.commit();
        sqlsession.commit();
        //6.释放资源
        sqlsession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    /**
     *测试查询所有账户，同时包含用户信息
     */
    @Test
    public void testFindAllAccountUser(){
        List<AccountUser> accountUsers = accountDao.findAllAccount();
        for (AccountUser au : accountUsers) {
            System.out.println(au);
            System.out.println(au.getUser());
        }
    }
}
