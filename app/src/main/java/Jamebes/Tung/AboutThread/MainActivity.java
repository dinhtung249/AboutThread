package Jamebes.Tung.AboutThread;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.time.Clock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 3 method create Thread
        MethodCreate.MyThread myThread = new MethodCreate.MyThread();
        myThread.start();

        MethodCreate.MyRunnable myRunnable = new MethodCreate.MyRunnable();
        new Thread(myRunnable).start();

        MethodCreate.MyCallable myCallable = new MethodCreate.MyCallable();
        FutureTask<String> futureTask = new FutureTask<String>(myCallable){
            @Override
            protected void done() {
                System.out.println("Start");
                super.done();
                System.out.println("Working");

                try {
                    System.out.println("done " + get());
                } catch (ExecutionException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(futureTask).start();
        try {
            System.out.println("Method 3 result: " + futureTask.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

        /*
//        about start and run
        MethodCreate.MyThread2 myThread2 = new MethodCreate.MyThread2();
//        myThread2.start();
        myThread2.run();

         */

//        Thread.join()

        try {
            AboutJoin aboutJoin = new AboutJoin();
            aboutJoin.Thread1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }




}