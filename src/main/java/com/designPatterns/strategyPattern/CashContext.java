package com.designPatterns.strategyPattern;

public class CashContext {
    private CashSuper cs;
    public CashContext(String type){
        switch (type){
            case "normal":
                cs=new CashNormal();
                break;
            case "discount":
                cs=new CashRebate(0.8);
                break;
            case "return":
                cs =new CashReturn(500,100);
                break;
        }

    }
    public double getMoney(double money){
    return  cs.acceptCash(money);
    }
}
