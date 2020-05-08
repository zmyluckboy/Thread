package com.hwsoft.demo;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunable());
        thread.setName("test create thread");
        thread.start();
    }
}
