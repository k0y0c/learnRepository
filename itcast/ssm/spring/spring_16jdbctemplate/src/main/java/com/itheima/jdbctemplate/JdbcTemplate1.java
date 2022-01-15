package com.itheima.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate的最基本用法
 */
public class JdbcTemplate1 {
    public static void main(String[] args) {
        //准备数据源：spring的内置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/itheima_spring");
        ds.setUsername("root");
        ds.setPassword("root");
        //1.创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //给JdbcTemplate设置数据源
        jdbcTemplate.setDataSource(ds);
        //2.执行操作
        jdbcTemplate.execute("insert into account(name,money)value('ccc',10000)");
    }
}
