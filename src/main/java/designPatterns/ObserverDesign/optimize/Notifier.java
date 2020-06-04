package designPatterns.ObserverDesign.optimize;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Notifier
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 10:10
 * Version 1.0
 **/
public abstract class Notifier {

    private List<Observer> observers = new ArrayList<>();

    public void update(){
        for(Observer observer:observers){
            observer.update();
        }
    }

    public void addServer(Observer observer){
        observers.add(observer);
    }

    public void deleteServer(Observer observer){
        observers.remove(observer);
    }

    public abstract String getState();

    public abstract void setState(String s);


}
