package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * zaimybatis中针对CRUD一共四个注解
 * @Select @Insert @Update @Delete
 */
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 保存用户信息
     * @param user
     */
    @Insert("insert into user(username,address,sex,birthday)value(#{username},#{address},#{sex},#{birthday})")
    void saveUser(User user);

    /**
     *更新用户信息
     * @param user
     */
    @Update("update user set username=#{username},sex=#{sex},birthday=#{birthday},address=#{address} where id=#{id} ")
    void updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    @Delete("delete from user where id = #{id}")
    void deleteUser(Integer id);

    /**
     * 根据id查询一个用户信息
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    /**
     * 根据用户名称模糊查询
     * @param username
     * @return
     */
    //@Select("select * from user where username like '%${value}%' ")
    @Select("select * from user where username like #{uername}")
    List<User> findUserByName(String username);

    /**
     * 查询总用户数量
     * @return
     */
    @Select("select count(*) from user ")
    int findTotalUser();
}
