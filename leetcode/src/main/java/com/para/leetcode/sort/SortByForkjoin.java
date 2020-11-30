package com.para.leetcode.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SortByForkjoin {

    private static final String filePath = "data/data1.txt";
    private static final String sortFilePath = "data/data1-sort.txt";


    public static final void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        int size = 100_000;

        int[] array = new int[size];
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line = null;
        int i = 0;
        int partion = 0;

        List<String> partFiles = new ArrayList<>();

        while((line = reader.readLine()) != null) {
            array[i++] = Integer.parseInt(line);
            if(i == size) {
                i = 0;
                String fileName = "data/data1-part-" + partion + ".txt";
                doPartitionSort(pool, fileName, array, 0, size);
                partFiles.add(fileName);

            }
        }
        reader.close();

        if(i > 0) {
            String fileName = "data/data1-part-" + partion ++ + ".txt";
            doPartitionSort(pool, fileName, array, 0 , i);
            partFiles.add(fileName);
        }

        if (partion > 1) {
            MergerFileSortTask mtask = new MergerFileSortTask(partFiles, sortFilePath);
            pool.submit(mtask);
            mtask.get();
        } else {
            
        }
        pool.shutdown();
    }

    private static void doPartitionSort(ForkJoinPool pool, String fileName, int[] array, int start, int end) throws FileNotFoundException, ExecutionException, InterruptedException {
        ArrayMergerSortTask task = new ArrayMergerSortTask(array, start, end);
        pool.submit(task);
        task.get();
        try (PrintWriter pw = new PrintWriter(fileName);) {
            for (int i = start; i < end; i++) {
                pw.println(array[i]);
            }
        }
    }
}
