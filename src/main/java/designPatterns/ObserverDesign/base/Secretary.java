package designPatterns.ObserverDesign.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Secretary
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 9:42
 * Version 1.0
 **/
public class Secretary {
    private List<StockObserver> stockObservers =new ArrayList<>();
    private String name;
    private String action ;

    public void addObserver(StockObserver observer){
        stockObservers.add(observer);
    }

    public List<StockObserver> getStockObservers() {
        return stockObservers;
    }

    public void setStockObservers(List<StockObserver> stockObservers) {
        this.stockObservers = stockObservers;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void update(){
        for(StockObserver observer:stockObservers ){
            observer.update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
