package ssm.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ssm.demo.domain.Account;

import java.util.List;

@Repository
public interface AccountDao {

    @Insert(value = "insert into account (username,password) values (#{username},#{password})")
    public void saveAccount(Account account);

    @Select(value = "select * from account")
    public List<Account> findAll();
}
