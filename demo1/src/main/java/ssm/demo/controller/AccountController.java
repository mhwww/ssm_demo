package ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.demo.domain.Account;
import ssm.demo.service.AccountService;

import java.util.List;

@Controller
//@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("访问成功");
        List<Account> list = accountService.findAll();
        for (Account account:list){
            System.out.println(account);
        }
        model.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){

        accountService.saveAccount(account);
        System.out.println("保存完成！！！");
        return "success";
    }
}
