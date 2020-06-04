package thread.ThreadLocal;

import java.math.BigDecimal;

/**
 * @ClassName Task
 * @Description TODO
 * @Author Administrator
 * @Date 2019/8/15 11:09
 * Version 1.0
 **/
public class Task {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static Integer test() {
        test1();
        System.out.println(Thread.currentThread()+"调用次数"+threadLocal.get());
        return threadLocal.get();
    }

    public static void test1() {
        try {

                System.out.println(1 / 0);

        } catch (Exception e) {
            if (threadLocal.get() == null) {
                threadLocal.set(1);
                System.out.println(Thread.currentThread() + "第" + threadLocal.get() + "次调用");
            } else {
                threadLocal.set(threadLocal.get() + 1);
                System.out.println(Thread.currentThread() + "第" + threadLocal.get() + "次调用");
            }
            if (threadLocal.get() != null && threadLocal.get() > 5) {
                System.out.println("------------------------");
                throw new RuntimeException(e.getMessage());
//                System.out.println(Thread.currentThread()+"调用次数"+threadLocal.get());
            }else{
                test1();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new BigDecimal(20).compareTo(new BigDecimal(10))>0);
    }
}
