package thread.ThreadLocal;

/**
 * @ClassName Thread1
 * @Description TODO
 * @Author Administrator
 * @Date 2019/8/15 11:13
 * Version 1.0
 **/
public class Thread4 extends Thread {
    @Override
    public void run() {
////        for (int i=0;i<100;i++){
//            Integer test = new Task().test();
//            System.out.println(test);
////        }
        Task.test();
    }
}
