package thread.threadbBasic;

public class SuspendAndResumeThread3 extends Thread{
    @Override
    public void run() {
        super.run();
         int i=0;
         long beginTime=System.currentTimeMillis();
        for(int j=0;j<50000000;j++){
        i+=j;
        Thread.yield();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("useTime="+(endTime-beginTime));
    }

    public static void main(String[] args) throws InterruptedException {
        final SuspendAndResumeThread3 thread3 =new SuspendAndResumeThread3();
        thread3.start();
}}
