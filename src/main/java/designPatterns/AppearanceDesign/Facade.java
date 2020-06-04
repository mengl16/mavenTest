package designPatterns.AppearanceDesign;

/**
 * @ClassName Facade
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/25 16:36
 * Version 1.0
 **/
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;
    public Facade(){
        subSystemOne =new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }
    public  void methodA(){
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();

    }

    public  void methodB(){
        System.out.println("方法组B");
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
