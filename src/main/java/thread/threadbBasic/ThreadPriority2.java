package thread.threadbBasic;

public class ThreadPriority2 extends Thread{
    @Override
    public void run() {
        super.run();
         int i=0;
         long beginTime=System.currentTimeMillis();
        for(int j=0;j<5000000;j++){
        i+=j;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("ThreadPriority2 useTime="+(endTime-beginTime));
    }
}
