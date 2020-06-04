package designPatterns.BuliderPattern;

/**
 * @ClassName Director
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 14:38
 * Version 1.0
 **/
public class Director {


    public void bulid(Bulider bulider){
        bulider.buildPartA();
        bulider.buildPartB();
        bulider.getResult();
    }
}
