package com.para.network.nio.buffer;


import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.nio.ByteBuffer;

public class AllocateBuffer {


    public static void main(String[] args) {

        OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        System.out.println("before allocate: " + osmxb.getFreePhysicalMemorySize());
        /**
         * 堆上分配
         */

        ByteBuffer byteBuffer = ByteBuffer.allocate(200000);
        System.out.println("byteBuffer = " + byteBuffer);
        System.out.println("after allocate: " + osmxb.getFreePhysicalMemorySize());

        ByteBuffer directBuffer = ByteBuffer.allocateDirect(200000);


    }
}
