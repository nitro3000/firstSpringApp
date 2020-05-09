package com.go2it.service;

public class ABC implements IGreetingService {
    private String text;
    private int repeat;

    public ABC() {

    }

    public ABC(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public ABC(int repeat) {
        this.repeat = repeat;
    }


    public void sendGreeting() {
        for (int i = 0;i<this.repeat;i++)
        System.out.println ("ABC." + " " + text);
    }
}
