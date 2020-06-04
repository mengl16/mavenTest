package thread.threadbBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepThread extends Thread {
 private int i=100;
    @Override
    public void run() {
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           try {
               System.out.println("run");
               System.out.println("btime="+format.format(new Date()));
               while(i>0){
                   i--;
                   System.out.println("sthreadName="+Thread.currentThread().getName());
                   System.out.println("time="+format.format(new Date()));
                   Thread.sleep(1000);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    public static void main(String[] args) {
        int i=100;
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SleepThread t= new SleepThread();
        t.setName("A");
        t.start();
        try {
            System.out.println("main");
            System.out.println("btime="+format.format(new Date()));
            while(i>0){
                i--;
                System.out.println("threadName="+Thread.currentThread().getName());
                System.out.println("stime="+format.format(new Date()));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
