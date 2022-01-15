package cn.edu.tynu.service.impl;

import cn.edu.tynu.dao.AccountDao;
import cn.edu.tynu.domain.Account;
import cn.edu.tynu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息...");
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账户...");
        return accountDao.findAll();
    }
}
