package com.zhangzhengju.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static class MyTask implements Runnable {
        public void run() {
            System.out.println(System.currentTimeMillis()
//                    + ":Thread ID:" + Thread.currentThread().getId()
                    + ":Thread Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        MyTask task = new MyTask();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            es.submit(task);
        }

        es.shutdown();
    }
}


