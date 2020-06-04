package com.designPatterns.simpeFactoryPattern;

public class Main {
    public static void main(String[] args) {
        BaseData data= Factory.createObject("sub");
        data.setX(2);
        data.setY(3);
        System.out.println(data.getResult());
    }
}
