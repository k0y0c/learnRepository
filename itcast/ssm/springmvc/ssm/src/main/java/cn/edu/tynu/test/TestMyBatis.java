package cn.edu.tynu.test;

import cn.edu.tynu.dao.AccountDao;
import cn.edu.tynu.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    /**
     * 测试查询所有
     * @throws Exception
     */
    @Test
    public void testFindAll() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void testSave() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //保存
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(400d);
        accountDao.saveAccount(account);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        in.close();
    }
}
