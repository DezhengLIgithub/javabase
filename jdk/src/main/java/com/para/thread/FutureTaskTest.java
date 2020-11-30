package com.para.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureTaskTest {


    public static void main(String[] args) throws InterruptedException {


        ExecutorService service = Executors.newCachedThreadPool();

        List<Future<Integer>> futures = service.invokeAll(Arrays.asList(
                ()->{
                    return 1;
                },
                ()->{
                    return 2;
                },
                ()->{
                    return 3;
                },
                ()->{
                    return 4;
                }
        ));

        futures.forEach(f->{
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
