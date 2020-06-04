package designPatterns.ObserverDesign.base;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 9:57
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setName("小丽");
        secretary.setAction("老板来了");
        StockObserver observer = new StockObserver("小明",secretary);
        StockObserver stockObserver = new StockObserver("小刚",secretary);
        secretary.addObserver(observer);
        secretary.addObserver(stockObserver);
        secretary.update();
    }
}
