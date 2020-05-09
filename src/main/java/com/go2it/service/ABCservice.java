package com.go2it.service;

public class ABCservice {
    IGreetingService greeting;
    public ABCservice() {}
    public ABCservice(IGreetingService greeting) { this.greeting = greeting; }

    public IGreetingService getGreeting() {
        return greeting;
    }

    public void setGreeting(IGreetingService greeting) {
        this.greeting = greeting;
    }

    public void start() {
        if (greeting != null) {
            greeting.sendGreeting ( );
        }
    }
}
