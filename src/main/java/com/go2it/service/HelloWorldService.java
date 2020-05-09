package com.go2it.service;

public class HelloWorldService implements IGreetingService {
    private String message;
    private int repeat;

    public HelloWorldService() {
    }

    public HelloWorldService(String message) {
        this.message = message;
    }

    public HelloWorldService(int repeat) {
        this.repeat = repeat;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }


    public void sendGreeting() {
        for (int i = 0; i < this.repeat; i++) {
            System.out.println ("Hello World!" + message);
        }
    }
}
