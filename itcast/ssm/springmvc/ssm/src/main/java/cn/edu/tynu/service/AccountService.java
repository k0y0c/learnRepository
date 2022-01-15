package cn.edu.tynu.service;

import cn.edu.tynu.domain.Account;
import java.util.List;

public interface AccountService {
    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();
}
