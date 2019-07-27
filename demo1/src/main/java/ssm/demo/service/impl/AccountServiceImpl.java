package ssm.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.demo.dao.AccountDao;
import ssm.demo.domain.Account;
import ssm.demo.service.AccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("保存了Account");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询了所有客户");
        List<Account> list = accountDao.findAll();
        return list;
    }
}
