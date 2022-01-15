package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import javax.annotation.Resources;
import java.util.List;

/**
 * zaimybatis中针对CRUD一共四个注解
 * @Select @Insert @Update @Delete
 */
@CacheNamespace(blocking = true)
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from user")
    @Results(id = "userMap", value = {
            @Result(id = true , column = "id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(property = "accounts",column = "id",
                    many = @Many(select = "com.itheima.dao.AccountDao.findAccountByUid",fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    /**
     * 保存用户信息
     * @param user
     */
    @Insert("insert into user(username,address,sex,birthday)value(#{userName},#{userAddress},#{userSex},#{userBirthday})")
    void saveUser(User user);

    /**
     *更新用户信息
     * @param user
     */
    @Update("update user set username=#{userName},sex=#{userSex},birthday=#{userBirthday},address=#{userAddress} where id=#{userId} ")
    void updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    @Delete("delete from user where id = #{userId}")
    void deleteUser(Integer id);

    /**
     * 根据id查询一个用户信息
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    @ResultMap("userMap")       //标准写法@ResultMap(value={"userMap"})
    User findById(Integer id);

    /**
     * 根据用户名称模糊查询
     * @param username
     * @return
     */
    //@Select("select * from user where username like '%${value}%' ")
    @Select("select * from user where username like #{uername}")
    @ResultMap("userMap")
    List<User> findUserByName(String username);

    /**
     * 查询总用户数量
     * @return
     */
    @Select("select count(*) from user ")
    int findTotalUser();
}
