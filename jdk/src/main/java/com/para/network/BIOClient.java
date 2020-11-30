package com.para.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class BIOClient {

    public static void main(String[] args) {
        Socket socket = new Socket();
        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8888);
        try {
            socket.connect(inetSocketAddress);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeUTF("姜子牙");
            outputStream.flush();
            inputStream = new ObjectInputStream(socket.getInputStream());
            String msg = inputStream.readUTF();
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
