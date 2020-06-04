package thread.ThreadLocal;

/**
 * @ClassName Thread1
 * @Description TODO
 * @Author Administrator
 * @Date 2019/8/15 11:13
 * Version 1.0
 **/
public class Thread1 extends Thread {
    @Override
    public void run() {
//        for (int i=0;i<100;i++){
//            Task.threadLocal.set(i);
//            System.out.println(Thread.currentThread()+"的值为:"+Task.threadLocal.get());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        Task.test();
    }
}
