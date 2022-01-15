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

public class SecondLevelCacheTest {
    private InputStream in ;
    private SqlSessionFactory factory ;

    @Before     //用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);

    }

    @After      //用于在测试方法执行之后执行
    public void destroy() throws IOException {
        in.close();
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void testFirstLeverCache(){
        SqlSession sqlSession1 = factory.openSession();
        UserDao dao1 = sqlSession1.getMapper(UserDao.class);
        User user1 = dao1.findById(41);
        System.out.println(user1);
        sqlSession1.close();

        SqlSession sqlSession2 = factory.openSession();
        UserDao dao2 = sqlSession2.getMapper(UserDao.class);
        User user2 = dao2.findById(41);
        System.out.println(user2);
        sqlSession2.close();

        System.out.println(user1 == user2);
    }


}
