package throwable;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName xxx
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/12 11:04
 * Version 1.0
 **/
public class xxx {
    public static void main(String[] args) {
        System.out.println(getIPAddress());
    }

    /**
     * @return  本机IP 地址
     */
    public static String getIPAddress() {
        InetAddress ia = null;
        try {
            ia = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (ia == null ) {
            return "some error..";
        }
        else{
            return ia.getHostAddress();
        }
    }

    /**
     * 获取线程ID
     * @return
     */
    public static long getThreadIP() {
       return Thread.currentThread().getId();
    }



}
