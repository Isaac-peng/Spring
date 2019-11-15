package com.isaacp;

public class Advice {

    public void PostConstruct(){
        System.out.println("前置增强");
    }
    public void BeforeDestory(){
        System.out.println("后置增强");
    }
}
