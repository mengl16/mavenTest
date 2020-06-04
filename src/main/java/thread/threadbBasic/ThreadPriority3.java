package thread.threadbBasic;

public class ThreadPriority3 extends Thread{
    @Override
    public void run() {
        super.run();
         int i=0;
         long beginTime=System.currentTimeMillis();
        for(int j=0;j<5000000;j++){
        i+=j;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("ThreadPriority3 useTime="+(endTime-beginTime));
    }

    public static void main(String[] args) {
        for(int i=0;i<15;i++){
        ThreadPriority2 priority2 =new ThreadPriority2();
        priority2.setPriority(10);
        priority2.start();
        ThreadPriority3 priority3 =new ThreadPriority3();
        priority3.setPriority(1);
        priority3.start();
    }}
}
