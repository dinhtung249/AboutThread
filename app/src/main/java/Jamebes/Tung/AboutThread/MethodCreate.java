package Jamebes.Tung.AboutThread;

import java.util.concurrent.Callable;

public class MethodCreate {

    public static class MyThread extends Thread{
        @Override
        public void run() {
            super.run();
            System.out.println("Method 1");
        }
    }

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Method 2");
        }
    }

    public static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Method 3";
        }
    }

    // test thread #start() and #run()
    public static class MyThread2 extends Thread{
        @Override
        public void run() {
            super.run();
            System.out.println("Thread : " + Thread.currentThread().getName());
        }
    }
}
