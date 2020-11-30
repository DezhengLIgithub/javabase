package com.para.network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class UseNetworkInterface {

    public static void main(String[] args) throws SocketException {

//        InetAddress address = InetAddress.getByName("127.0.0.1");
        NetworkInterface networkInterface = NetworkInterface.getByName("127.0.0.1");
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();

        while (inetAddresses.hasMoreElements()) {

        }
    }
}
