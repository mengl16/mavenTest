package designPatterns.BuliderPattern;

/**
 * @ClassName Bulider
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 14:28
 * Version 1.0
 **/
public abstract class Bulider {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
