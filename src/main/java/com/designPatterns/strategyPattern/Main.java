package com.designPatterns.strategyPattern;

public class Main {
    public static void main(String[] args) {
        CashContext cashContext=new CashContext("return");
        double money=cashContext.getMoney(500);
        System.out.println(money);
    }
}
