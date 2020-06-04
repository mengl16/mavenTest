package thread.threadbBasic;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("ThreadPriority:priority="+this.getPriority());
        ThreadPriority1 priority1 =new ThreadPriority1();
        priority1.start();

    }

    public static void main(String[] args) {
        System.out.println("MainStartPriority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        ThreadPriority priority =new ThreadPriority();
        priority.start();
        System.out.println("MainEndPriority="+Thread.currentThread().getPriority());
    }
}
