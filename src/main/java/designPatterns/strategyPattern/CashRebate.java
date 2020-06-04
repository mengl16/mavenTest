package designPatterns.strategyPattern;

public class CashRebate extends CashSuper {
    private double discount;
    public  CashRebate(double rate){
        this.discount=rate;
    }
    @Override
    /**
     * @功能描述:
     * @param   :@param money:
     * @return  :double
     * @Author  : menglei
     * @Date    : 2020/6/3
     */
    public double acceptCash(double money) {
        return money*discount;
    }
}
