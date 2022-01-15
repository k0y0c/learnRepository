package com.itheima.test;
import com.itheima.dao.UserDao;
import com.itheima.domain.QueryVo;
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
public class MybatisTest {
    private InputStream in ;
    private SqlSession sqlsession ;
    private UserDao userDao ;

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
        userDao = sqlsession.getMapper(UserDao.class);
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
     * 入门案例  测试查询所有
     * @throws Exception
     */
    @Test
    public void testFindAll(){
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试保存对象
     */
    @Test
    public void testSave() throws IOException {
        User user = new User();
        user.setUserName("modify User property1");
        user.setUserAddress("北京顺义");
        user.setUserSex("男");
        user.setUserBirthday(new Date());
        System.out.println("保存操作之前："+user);     //保存操作之前：User{id=null, 略}
        //5.使用代理对象执行方法
        userDao.saveUser(user);
        System.out.println("保存操作之后："+user);     //保存操作之后：User{id=52,略}
    }

    /**
     * 测试更新操作
     * @throws IOException
     */
    @Test
    public void testUptate() throws IOException {
        User user = new User();
        user.setUserId(53);
        user.setUserName("mybatis updateuser111");
        user.setUserAddress("山西");
        user.setUserSex("女");
        user.setUserBirthday(new Date());
        //5.使用代理对象执行方法
        userDao.updateUser(user);
    }

    /**
     * 测试删除
     * @throws IOException
     */
    @Test
    public void testDelete() throws IOException {
        //5.使用代理对象执行方法
        userDao.deleteUser(51);
    }

    /**
     * 测试根据id查询用户
     * @throws IOException
     */
    @Test
    public void testFindById() throws IOException {
        //5.使用代理对象执行方法
        User user = userDao.findById(46);
        System.out.println(user);
    }

    /**
     * 测试根据姓名进行模糊查询
     */
    @Test
    public void testFindByName(){
        //5.使用代理对象执行方法
        //List<User> users = userDao.findByName("%王%");
        List<User> users = userDao.findByName("王");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试查询总记录条数
     */
    @Test
    public void testFindTotal(){
        //5.使用代理对象执行方法
        int total = userDao.findTotal();
        System.out.println(total);
    }

    /**
     * 测试使用QueryVo(内部封装多个对象)作为查询条件
     */
    @Test
    public void testFindByQueryVo(){
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUserName("%王%");
        queryVo.setUser(user);
        List<User> users = userDao.findByVo(queryVo);
        for (User u : users) {
            System.out.println(u);
        }
    }

}
