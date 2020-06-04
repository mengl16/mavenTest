package designPatterns.ObserverDesign.general;

import java.util.Date;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:47
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        GoodNotifier notifier = new GoodNotifier();
        PlayGameListener playGameListener =new PlayGameListener();
        WatchingTVListener watchingTVListener =new WatchingTVListener();
        notifier.addListener(playGameListener,"stopPlayingGame",new Date());
        notifier.addListener(watchingTVListener,"stopWatchingTV",new Date());
        notifier.notifyX();
    }
}
