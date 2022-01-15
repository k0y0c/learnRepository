package cn.edu.tynu.dao;

import cn.edu.tynu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();
}
