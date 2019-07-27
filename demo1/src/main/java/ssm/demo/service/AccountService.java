package ssm.demo.service;

import org.springframework.stereotype.Service;
import ssm.demo.domain.Account;

import java.util.List;

public interface AccountService {

    public void saveAccount(Account account);
    public List<Account> findAll();
}
