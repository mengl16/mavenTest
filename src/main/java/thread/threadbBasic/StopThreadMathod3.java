package thread.threadbBasic;

public class StopThreadMathod3 extends Thread {
    @Override
    public void run() {
        super.run();
        while(true){
            if(this.isInterrupted()){
            System.out.println("停止了");
            return;}
        }
    }
    public static void main(String[] args) {
        try {
            StopThreadMathod3 stopThread = new StopThreadMathod3();
            stopThread.start();
            Thread.sleep(200);
            stopThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
