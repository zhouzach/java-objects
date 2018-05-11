package org.zach.concurrent;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ExecutorService {

    public void waitit() {
        Thread.yield();

            try{
                wait();
                notifyAll();
            }catch (Exception e) {}


    }
    public static void main(String[] args) {

        final CyclicBarrier b = new CyclicBarrier(20);


        final Semaphore n = new Semaphore(1);
        System.out.println(n);
//        n.release();
        try {
            b.await();

            System.out.println("todo");
            n.acquire();
//            n.release();
            System.out.println("do");
        }catch (Exception e) {
            System.out.println("exp");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(1);

        }

        System.out.println("hh");
        System.out.println(n);
//        n.release();
//        System.out.println(n);
    }
}
