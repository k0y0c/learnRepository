package com.itheima.dao.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDaoImpl implements ItemsDao {
    @Override
    public List<Items> findAll() {
        //把数据库结果集转成java的List集合
        List<Items> list = new ArrayList<Items>();
        Connection connection = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        try{
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //先获取connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///maven","root","root");
            //获取执行sql对象
            ptmt = connection.prepareCall("select * from items");
            //执行数据库查询操作
            rs = ptmt.executeQuery();
            while (rs.next()){
                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));
                list.add(items);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ptmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
