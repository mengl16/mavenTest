package designPatterns.ObserverDesign.optimize;

/**
 * @ClassName Observer
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 10:08
 * Version 1.0
 **/
public abstract class Observer {
    protected Notifier notifier;
    protected String name;
    public abstract void update();
    public Observer(Notifier notifier, String name) {
        this.notifier = notifier;
        this.name = name;
    }
}
