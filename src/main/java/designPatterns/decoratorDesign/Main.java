package designPatterns.decoratorDesign;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/30 17:03
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ConcreteComponent component=new ConcreteComponent();
        DeCorator deCorator =new DeCorator();
        DeCoratorA deCoratorA =new DeCoratorA();
        DeCoratorB deCoratorB=new DeCoratorB();
        deCorator.setComponent(component);
        deCoratorA.setComponent(deCorator);
        deCoratorB.setComponent(deCoratorA);
        deCoratorB.Operation();
    }
}
