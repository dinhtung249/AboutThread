package Jamebes.Tung.AboutThread;

import android.os.SystemClock;

public class AboutJoin {

    public  void Thread1() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            SystemClock.sleep(1000);
            System.out.println("Thread 1");
        });
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2");
        });
        thread2.start();
        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3");
        });
        thread3.start();

    }






}
