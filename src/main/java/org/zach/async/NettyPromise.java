package org.zach.async;

import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;


public class NettyPromise {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) throws Throwable {
        //线程池
        EventExecutorGroup group = new DefaultEventExecutorGroup(1);
        //向线程池中提交任务，并返回Future，该Future是netty自己实现的future
        //位于io.netty.util.concurrent包下，此处运行时的类型为PromiseTask
        Future<?> f = group.submit(() -> {
            System.out.println("任务正在执行");
            //模拟耗时操作，比如IO操作
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务执行完毕");
        });
        //增加监听
        f.addListener((FutureListener) arg0 -> System.out.println("ok!!!"));
        System.out.println("main thread is running.");
    }

}
