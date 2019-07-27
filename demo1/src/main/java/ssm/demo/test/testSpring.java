package ssm.demo.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.demo.dao.AccountDao;
import ssm.demo.domain.Account;
import ssm.demo.service.AccountService;

import java.io.InputStream;
import java.util.List;

public class testSpring {

    @Test
    public  void test1(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService as = (AccountService) ac.getBean("accountService");

        as.findAll();

    }

    @Test
    public void test2() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> list = accountDao.findAll();
        for (Account account: list) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }

    @Test
    public void test3() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setUsername("熊大");
        account.setPassword("456");
        accountDao.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
