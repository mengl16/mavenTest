package designPatterns.ObserverDesign.general;

/**
 * @ClassName GoodNotifier
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:40
 * Version 1.0
 **/
public class GoodNotifier extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人!");
        eventHandler.addEvent(new Event(object,methodName,args));
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        eventHandler.notifyx();
    }
}
