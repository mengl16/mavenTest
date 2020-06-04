package thread.threadbBasic;

public class ThreadTest2 extends Thread {
    private int i=5;
    @Override
    synchronized  public void run() {
        super.run();
        System.out.println("i="+(i--)+"thread="+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadTest2 t =new ThreadTest2();
        Thread t1 =new Thread(t);
        Thread t2 =new Thread(t);
        Thread t3 =new Thread(t);
        Thread t4 =new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
