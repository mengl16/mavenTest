package designPatterns.ObserverDesign.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EventHandler事件管理类
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:26
 * Version 1.0
 **/
public class EventHandler {
    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<>();
    }

    public void addEvent (Event e){
        events.add(e);
    }

    public  void removeEvent(Event e){
        events.remove(e);
    }

    public void notifyx(){
        for(Event e:events){
            e.invoke();
        }
    }
}
