package com.zyn.ui;

import com.zyn.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as= (IAccountService)ac.getBean("accountService");
        as.saveAccount();
    }



}
