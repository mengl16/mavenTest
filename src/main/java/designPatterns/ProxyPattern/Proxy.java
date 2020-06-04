package designPatterns.ProxyPattern;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author Administrator
 * @Date 2018/11/20 8:59
 * Version 1.0
 **/
public class Proxy extends Subject {
    private RealSubject realSubject;
    @Override
    void request() {
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.request();
    }
}
