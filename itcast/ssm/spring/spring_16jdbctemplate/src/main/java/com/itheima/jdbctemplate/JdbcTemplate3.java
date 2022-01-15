package com.itheima.jdbctemplate;

import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * JdbcTemplate的CRUD操作
 */
public class JdbcTemplate3 {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        //3.执行操作
        //保存
        //jdbcTemplate.update("insert into account(name,money)value(?,?)","eee",3333f);
        //更新
        //jdbcTemplate.update("update account set name=?,money=? where id=?","test","4567",8);
        //删除
        //jdbcTemplate.update("delete from account where id = ?",8);
        //查询所有
       /* List<Account> accounts = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 1000f);
        for (Account account : accounts) {
            System.out.println(account);
        }*/
        //查询一个
        //List<Account> accounts1 = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), 1);
        //System.out.println(accounts1.isEmpty()?"没有内容":accounts1.get(0));
        //查询返回一行一列(使用聚合函数，但不加group by子句)
        Long count = jdbcTemplate.queryForObject("select count(*) from account where money > ?", Long.class, 1000f);
        System.out.println(count);
    }
}
