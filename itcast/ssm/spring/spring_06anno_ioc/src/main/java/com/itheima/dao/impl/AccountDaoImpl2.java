package com.itheima.dao.impl;
import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao{
    public void saveAccount() {
        System.out.println("保存了账户2222222");
    }
}
