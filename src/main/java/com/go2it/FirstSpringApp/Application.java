package com.go2it.FirstSpringApp;

import com.go2it.service.IGreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final  Logger logger = LoggerFactory.getLogger (Application.class);

    IGreetingService greeting;
    public Application() { }
    public Application(IGreetingService greeting) {
        this.greeting = greeting;
    }
    public IGreetingService getGreeting() {
        return greeting;
    }
    public void setGreeting(IGreetingService greeting) {
        this.greeting = greeting;
    }




    public static void main(String[] args) {
        /* ++++++++++++++  example 1 and 3 .Hello World! My name is Bond. ++++++++++++++++++++++++++++++++++++++++++ */
//        ApplicationContext ctx = new ClassPathXmlApplicationContext ("beans.xml");
//        IGreetingService service = (IGreetingService)ctx.getBean ("helloWorldService");
//        service.sendGreeting ();
//        /* ++++++++++++++  example 2 Hello, Kitty! +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
//        ApplicationContext ctx2 = new ClassPathXmlApplicationContext ("beans.xml");
//        IGreetingService service2 = (IGreetingService)ctx2.getBean ("helloKittyService");
//        service2.sendGreeting ();
        /* ++++++++++++++  example 4,5,6,7  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
//        ApplicationContext ctx3 = new ClassPathXmlApplicationContext ("beans.xml");
//        Application application = (Application) ctx3.getBean ("application");
//        application.start ( );

        logger.debug ("Hello from debug.");
        logger.info ("Hello from info.");
        logger.error ("Hello from error.");
        System.out.println ("Hello" );
    }

    public void start() {
        if (greeting != null) {
            greeting.sendGreeting ( );
        }
    }
}
