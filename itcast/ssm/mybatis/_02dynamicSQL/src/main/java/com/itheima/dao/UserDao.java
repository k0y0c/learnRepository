package com.itheima.dao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;


import java.util.List;
/**
 * 用户的持久层接口
 */

public interface UserDao {
    /**
     * 查询所有操作
     * @return
     */
    //@Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     * @param name
     * @return
     */
    List<User> findByName(String name);

    /**
     * 根据QueryVo中的条件查询用户
     * @param vo
     * @return
     */
    List<User> findByVo(QueryVo vo);

    /**
     * 根据传入参数条件查询
     * @param user 查询条件：有可能有用户名，有可能有性别，还有可能都有
     * @return
     */
    List<User> findUserByCondition(User user);

    /**
     * 根据id集合查询用户
     * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);
}
