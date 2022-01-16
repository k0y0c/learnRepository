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
import java.util.Date;
import java.util.List;
public class AnnotationCRUDTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    private UserDao userDao;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
       /* for (User user : users) {
            System.out.println(user);
            System.out.println("当前用户的账户信息");
            System.out.println(user.getAccounts());
        }*/
    }

   @Test
    public void testSave(){
        User user = new User();
        user.setUserName("mybatis annotation");
        user.setUserAddress("北京市昌平区");
        userDao.saveUser(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUserId(57);
        user.setUserName("mybatis annotation_update");
        user.setUserAddress("北京市海淀区");
        user.setUserSex("男");
        user.setUserBirthday(new Date());
        userDao.updateUser(user);
    }

    @Test
    public void testDelete(){
        userDao.deleteUser(55);
    }

    @Test
    public void testFindOne(){
        User user = userDao.findById(58);
        System.out.println(user);
    }

    @Test
    public void testFindByName(){
        //List<User> users = userDao.findUserByName("mybatis");
        List<User> users = userDao.findUserByName("%mybatis%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindTotal(){
        int total = userDao.findTotalUser();
        System.out.println(total);
    }


}
