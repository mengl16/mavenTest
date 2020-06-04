package thread.threadbBasic;

public class SuspendAndResumeThread2 {
  synchronized  public void printString(){
      System.out.println("begin");
      if("a".equals(Thread.currentThread().getName())){
          System.out.println("a线程永远suspend");
          Thread.currentThread().suspend();//不会释放锁
      }
      System.out.println("end");
    }

    public static void main(String[] args) throws InterruptedException {
        final SuspendAndResumeThread2 suspendAndResumeThread2 =new SuspendAndResumeThread2();
        Thread thread =new Thread(){
            @Override
            public void run() {
                super.run();
                suspendAndResumeThread2.printString();
            }
        };
        thread.setName("a");
        thread.start();
        Thread.sleep(1000);

        Thread thread1 =new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("进入不了printString方法");
                System.out.println("printString方法被锁定");
                suspendAndResumeThread2.printString();
            }
        };
        thread1.start();
    }
}
