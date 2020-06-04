package designPatterns.strategyPattern;

public class CashReturn extends CashSuper {
    private double targetMoney;
    private double returnMoney;
    public CashReturn(double money,double returnMoney){
        this.targetMoney=money;
        this.returnMoney=returnMoney;
    }
    @Override
    public double acceptCash(double money) {
       if(money>=targetMoney){
           money=money-returnMoney;
           return money;
       }
       return money;
    }
}
