package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
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

public class UserTest {
    private InputStream in ;
    private SqlSession sqlSession ;
    private UserDao userDao ;
    private SqlSessionFactory factory ;

    @Before     //用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3.使用工厂生产sqlSession对象
        //sqlsession = factory.openSession(true);
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After      //用于在测试方法执行之后执行
    public void destroy() throws IOException {
        //提交事务
        //sqlsession.commit();
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void testFirstLeverCache(){
        User user1 = userDao.findById(41);
        System.out.println(user1);
        /*sqlSession.close();
        //再次开启SqlSession
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);*/
        sqlSession.clearCache();
        User user2 = userDao.findById(41);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }

    /**
     * 测试缓存同步
     */
    @Test
    public void testClearCache(){
        //1.根据id查询用户
        User user1 = userDao.findById(41);
        System.out.println(user1);
        //2.查询id为42的用户
        User user2 = userDao.findById(42);
        System.out.println(user2);
        //2.更新42用户信息
        user2.setUsername("update user clear cache");
        user2.setAddress("北京市海淀区");
        userDao.updateUser(user2);
        //3.再次查询id为41的用户
        User user3 = userDao.findById(41);
        System.out.println(user3);
        System.out.println(user1 == user3);
    }

}
