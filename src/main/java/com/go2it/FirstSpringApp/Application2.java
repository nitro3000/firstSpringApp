package com.go2it.FirstSpringApp;

import com.go2it.service.ABCservice;
import com.go2it.service.IGreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("beans2.xml");
        IGreetingService service4 = (IGreetingService)context.getBean ("abc");
        service4.sendGreeting ();

        ABCservice service = (ABCservice) context.getBean ("abcService");
        service.start ( );


    }
}
