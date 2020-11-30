package com.para.leetcode.sort;

import java.io.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

public class MergerFileSortTask extends RecursiveTask<String> {

    List<String> partFiles;
    int lo, hi;
    String fileName;


    public MergerFileSortTask(List<String> partFiles, int lo, int hi, String fileName) {
        super();
        this.partFiles = partFiles;
        this.lo = lo;
        this.hi = hi;
        this.fileName = fileName;
    }

    public MergerFileSortTask(List<String> partFiles, String fileName) {
        this(partFiles, 0, partFiles.size(), fileName);
    }

    @Override
    protected String compute() {
        int fileCount = hi - lo;
        if (fileCount > 2) {		//fileCount>2 则继续拆分
            int mid = fileCount / 2;
            MergerFileSortTask task1 = new MergerFileSortTask(partFiles, lo, lo + mid, this.fileName + "-1");
            MergerFileSortTask task2 = new MergerFileSortTask(partFiles, lo + mid, hi, this.fileName + "-2");

            // 任务提交forkjoinPool中去执行
            task1.fork();
            task2.fork();

            // 合并两个文件
            try {		//文件
                this.mergerFile(task1.get(), task2.get());	//合并执行结果
            } catch (IOException | InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        } else if (fileCount == 2) {		//文件个数为2，合并文件
            // 合并两个文件
            try {
                this.mergerFile(this.partFiles.get(lo), this.partFiles.get(lo + 1));
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else if (fileCount == 1) {
            return this.partFiles.get(lo);
        }
        return this.fileName;

    }


    private void mergerFile(String f1, String f2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(f1));
                BufferedReader reader2 = new BufferedReader(new FileReader(f2));
                PrintWriter pw = new PrintWriter(fileName)) {
            String s1 = reader1.readLine(), s2 = reader2.readLine();
            Integer d1 = s1 == null ? null : Integer.valueOf(s1);
            Integer d2 = s2 == null ? null : Integer.valueOf(s2);

            while (true) {
                if (s1 == null) {
                    while (s2 != null) {
                        pw.println(s2);
                        s2 = reader2.readLine();
                    }
                } else if(s2 == null) {
                    while (s1 != null) {
                        pw.println();
                        s1 = reader1.readLine();
                    }
                } else {
                    while (d1 <= d2 && s1 != null) {
                        pw.println(s1);
                        s1 = reader1.readLine();
                        if(s1 != null) {
                            d1 = Integer.valueOf(s1);
                        }
                    }

                    while (d1 > d2 && s2 != null) {
                        pw.println(s2);
                        s2 = reader2.readLine();
                        if(s2 != null) {
                            d2 = Integer.valueOf(s2);
                        }
                    }
                }
                if(s1 == null && s2 == null) {
                    break;
                }
            }
        }
    }
}
