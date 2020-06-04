package thread.threadbBasic;

public class ThreadTest extends Thread  {
    @Override
    public void run() {
            try {
                for(int i = 1 ; i <=10 ; i++){
                    int time  = (int)(Math.random()*1000);
                     Thread.sleep(time);
                    System.out.println("sleepTime="+time);
                    System.out.println("run=" +Thread.currentThread().getName());
                    System.out.println("runTime=" +System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        ThreadTest threadTest =new ThreadTest();
        threadTest.setName("myThread");
        threadTest.start();
        System.out.println("currentTime="+System.currentTimeMillis());
        for( int i = 1;i <=10 ; i++){
            int time = (int)( Math.random() * 1000 );
            try {
                Thread.sleep(time);
                System.out.println("sleepTime="+time);
                System.out.println("main="+Thread.currentThread().getName());
                System.out.println("mainTime="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
