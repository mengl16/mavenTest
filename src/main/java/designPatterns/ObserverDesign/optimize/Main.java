package designPatterns.ObserverDesign.optimize;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/28 16:50
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setAction("老板来了");
        StockObserver observer = new StockObserver(secretary,"小明");
        StockObserver stockObserver = new StockObserver(secretary,"小刚");
        secretary.addServer(observer);
        secretary.addServer(stockObserver);
        secretary.update();
    }
}
