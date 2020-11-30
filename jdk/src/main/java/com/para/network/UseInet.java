package com.para.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UseInet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");//发起一个实际的网络请求，通过dns进行解析
//        InetAddress.getAllByName()
        System.out.println(inetAddress);
    }
}
