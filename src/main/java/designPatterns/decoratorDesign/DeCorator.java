package designPatterns.decoratorDesign;

/**
 * @ClassName DeCorator
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/30 16:52
 * Version 1.0
 **/
public class DeCorator extends Component {
    private Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public DeCorator(){

    }
    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
        }
    }
}
