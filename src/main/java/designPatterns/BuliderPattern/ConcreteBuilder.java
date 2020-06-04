package designPatterns.BuliderPattern;

/**
 * @ClassName ConcreteBuilder
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 14:30
 * Version 1.0
 **/
public class ConcreteBuilder extends Bulider {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
