package designPatterns.ObserverDesign.general;

import java.util.Date;

/**
 * @ClassName PlayGameListener
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:38
 * Version 1.0
 **/
public class PlayGameListener {

    public PlayGameListener(){
        System.out.println("我正在玩游戏 开始时间"+new Date());
    }
    public void stopPlayingGame(Date date){
        System.out.println("老师来了，快回到座位上，结束时间"+date);
    }

}
