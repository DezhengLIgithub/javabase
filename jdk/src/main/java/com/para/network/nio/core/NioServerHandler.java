package com.para.network.nio.core;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioServerHandler implements Runnable {

    private volatile boolean started;
    private ServerSocketChannel serverSocketChannel;

    private Selector selector;

    public NioServerHandler(int port) {
        try {
            //创建选择器实例
            selector = Selector.open();
            //创建ServerSocketChannel实例
            serverSocketChannel = ServerSocketChannel.open();
            //设置通道为非阻塞模式
            serverSocketChannel.configureBlocking(false);
            //绑定端口
            serverSocketChannel.socket().bind(new InetSocketAddress(port));
            started = true;
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器已启动，端口号：" + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (started) {
            try {
                //获取当前有哪些事件
                selector.select(1000);
                //获取当前事件集合
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    handleInput(key);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 处理事件的发生
     * @param key
     */
    private void handleInput(SelectionKey key) throws IOException {
        if(key.isValid()) {
            //处理新接入的客户端请求
            if (key.isAcceptable()) {
                //获取当前
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                //接受连接
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                //关注读数据
                sc.register(selector, SelectionKey.OP_READ);
            } else if(key.isReadable()) {
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                //从通道里面读取数据，然后写入buffer
                int readBytes = sc.read(byteBuffer);
                if(readBytes>0) {
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);
                    String msg = new String(bytes, "UTF-8");
                    System.out.println("服务器收到消息：" + msg);
                    String result = "ok";
                    doWrite(sc, result);
                } else if (readBytes < 0) {
                    key.cancel();
                    sc.close();
                }
            } else if(key.isWritable()) {

            }
        }
    }

    private void doWrite(SocketChannel sc, String response) throws IOException {
        byte[] bytes = response.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        sc.write(byteBuffer);
    }

    public void stop(){
        started = false;
    }
}
