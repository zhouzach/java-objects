package org.zach.concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;


public class Interrupted {
    BlockingDeque<String> q;

    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("");
                return;
            }
        });
        t.join();


    }







}
