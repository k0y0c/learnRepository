package cn.itcast.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
    JDBC快速入门
 */
public class Demo01JDBC {
    public static void main(String[] args) throws Exception {
        //1. 导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
        //2. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3. 获取数据库连接对象 Connection
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        //可简写为：
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
        //4. 定义sql
        String sql = "update account set balance = 2000 where id = 1";
        //5. 获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
        //6. 执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);
        //7. 处理结果
        System.out.println(count);
        //8. 释放资源
        stmt.close();
        conn.close();
    }
}
