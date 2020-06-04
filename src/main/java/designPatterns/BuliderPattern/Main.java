package designPatterns.BuliderPattern;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 14:41
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        ConcreteBuilder b1 =new ConcreteBuilder();
        ConcreteBuilder b2 =new ConcreteBuilder();
        Director director = new Director();
        director.bulid(b1);
        director.bulid(b2);
        b1.getResult().show();
        b2.getResult().show();
    }


}
