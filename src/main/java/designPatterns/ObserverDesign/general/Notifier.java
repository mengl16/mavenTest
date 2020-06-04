package designPatterns.ObserverDesign.general;

/**
 * @ClassName Notifier
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:33
 * Version 1.0
 **/
public abstract class Notifier {
    protected EventHandler eventHandler = new EventHandler();

    public abstract void addListener(Object object,String methodName, Object...args);

    public abstract void notifyX();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
