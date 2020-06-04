package reflection;

/**
 * @ClassName FatherObject
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/12 15:59
 * Version 1.0
 **/
public abstract class FatherObject implements Runnable{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void doSomething(){
        System.out.println("做事情......");
    }

    public  void say(){
        System.out.println("111111");
    }
}
