package designPatterns.ObserverDesign.general;

import java.util.Date;

/**
 * @ClassName aa
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:50
 * Version 1.0
 **/
public class WatchingTVListener {
    public WatchingTVListener(){
        System.out.println("我正在看电视 "+new Date());
    }
    public void stopWatchingTV(Date date){
        System.out.println("老师来了，快关闭电视 。 结束时间"+date);
    }
}