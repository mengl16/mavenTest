package com.designPatterns.strategyPattern;

public class CashRebate extends CashSuper {
    private double discount;
    public  CashRebate(double rate){
        this.discount=rate;
    }
    @Override
    public double acceptCash(double money) {
        return money*discount;
    }
}
