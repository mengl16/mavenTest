package thread.ThreadLocal;

/**
 * @ClassName Run
 * @Description TODO
 * @Author Administrator
 * @Date 2019/8/15 11:21
 * Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.setName("线程A");
        Thread2 thread2 = new Thread2();
        thread2.setName("线程B");
        thread1.start();
        thread2.start();


        Thread3 thread3 = new Thread3();
        thread3.setName("线程C");
        Thread4 thread4 = new Thread4();
        thread4.setName("线程D");
        thread3.start();
        thread4.start();
    }
}
