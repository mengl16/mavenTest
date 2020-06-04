package designPatterns.ObserverDesign.optimize;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Secretary
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 10:19
 * Version 1.0
 **/
public class Secretary extends Notifier {
    private String action;
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getState() {
        return action;
    }

    @Override
    public void setState(String s) {
        this.action = s;
    }
}
