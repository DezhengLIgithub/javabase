package com.para.network.nio.buffer;

import java.nio.ByteBuffer;

public class BufferMethod {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(32);

        byteBuffer.put((byte)'a')
                .put((byte)'b')
                .put((byte)'c')
                .put((byte)'d')
                .put((byte)'e')
                .put((byte)'f');
        System.out.println("before flip():" + byteBuffer);
        byteBuffer.flip();//切换读写模式
        System.out.println("before get():" + byteBuffer);
        System.out.println("get():" + (char)byteBuffer.get());
        System.out.println("after get():" + byteBuffer);
        System.out.println("get(index):" + (char)byteBuffer.get(3));
        System.out.println("after get(index):" + byteBuffer);
        byteBuffer.clear();
        System.out.println("after clear:" + byteBuffer);

    }
}
