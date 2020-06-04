package thread.threadbBasic;

public class StopThreadMathod1 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 1; i <= 50000; i++) {
                if (interrupted()) {
                    System.out.println("停止了");
                  throw new InterruptedException();
                }
                System.out.println("i=" + i);
            }
            System.out.println("for之后运行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            StopThreadMathod1 stopThread = new StopThreadMathod1();
            stopThread.start();
            Thread.sleep(2);
            stopThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
