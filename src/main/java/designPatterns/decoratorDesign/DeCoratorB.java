package designPatterns.decoratorDesign;

/**
 * @ClassName DeCorator
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/30 16:52
 * Version 1.0
 **/
public class DeCoratorB extends DeCorator {
    @Override
    public void Operation() {
        super.Operation();
        System.out.println("衬衫");
    }
}
