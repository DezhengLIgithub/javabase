package com.para.leetcode.sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateNumber {


    private static final String filePath = "data/data1.txt";


    public static void main(String[] args) {
        Random random = new Random();
        try(PrintWriter out = new PrintWriter(new File(filePath))) {

            long beginTime = System.currentTimeMillis();
            System.out.println("beginTime:" + beginTime);

            for(int i = 0; i < 1_000_000; i ++) {
                out.println(random.nextInt());
                if(i % 10000 == 0) {
                    out.flush();
                }
                System.out.println("endTime:"+(System.currentTimeMillis() - beginTime));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
