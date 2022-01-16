package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

/**
 * 账户的业务层实现类
 * 事务控制应该都是在业务层
 */
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account findAccountById(Integer id) {
        return  accountDao.findAccountById(id);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        //2.1.根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //2.2.根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //2.3.转出账户减钱
        source.setMoney(source.getMoney()-money);
        //2.4.转入账户加钱
        target.setMoney(target.getMoney()+money);
        //2.5.更新转出账户
        accountDao.updateAccount(source);
        //int i = 1/0;
        //2.6.更新转入账户
        accountDao.updateAccount(target);
    }
}
