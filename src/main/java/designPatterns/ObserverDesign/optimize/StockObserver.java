package designPatterns.ObserverDesign.optimize;

/**
 * @ClassName StockObserver
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 10:22
 * Version 1.0
 **/
public class StockObserver extends Observer {
    public StockObserver(Notifier notifier, String name) {
        super(notifier, name);
    }

    @Override
    public void update() {
        System.out.println("关闭股票详情"+notifier.getState()+name);
    }
}
