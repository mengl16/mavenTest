package designPatterns.decoratorDesign;

/**
 * @ClassName ConcreteComponent
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/30 16:50
 * Version 1.0
 **/
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("小明");
    }
}
