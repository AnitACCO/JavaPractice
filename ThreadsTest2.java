import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Date;

class MyThreads implements Runnable{
    @Override
    public void run() {
        System.out.println("Print from " + Thread.currentThread().getName());
    }
}

public class ThreadsTest2 {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            MyThreads t11 = new MyThreads();
            Thread t1 = new Thread(t11);
            t1.start();
        }

    }
}
