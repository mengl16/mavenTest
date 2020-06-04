package designPatterns.ProxyPattern;

/**
 * @ClassName RealSubject
 * @Description TODO
 * @Author Administrator
 * @Date 2018/11/20 8:58
 * Version 1.0
 **/
public class RealSubject extends Subject {
    @Override
    void request() {
        System.out.println("逛街");
    }
}
