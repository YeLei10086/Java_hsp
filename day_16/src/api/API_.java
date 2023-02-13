package api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 叶磊
 * 演示 InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1、获取本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);  //LAPTOP-KQPHICHV/192.168.80.1

        //2、根据指定主机名 获取 InetAddress 对象
        InetAddress localHost2 = InetAddress.getByName("LAPTOP-KQPHICHV");
        System.out.println(localHost2);

        //3、根据域名返回 InetAddress 对象,例如：www.baidu.com
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println(address);    //www.baidu.com/14.215.177.38

        //4、通过 InetAddress 对象,获取对应的地址
        String hostAddress = address.getHostAddress();
        System.out.println("百度的主机地址:" + hostAddress);

        //5、通过 InetAddress 对象,获取对应的主机名/或者域名
        String hostName = address.getHostName();
        System.out.println("百度的主机域名:" + hostName);
    }
}
