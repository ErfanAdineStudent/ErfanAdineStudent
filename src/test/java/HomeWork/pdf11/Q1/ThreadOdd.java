package HomeWork.pdf11.Q1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadOdd implements Runnable {
    private static File file = new File();
    private Lock lock = new ReentrantLock();
    int a;
    public ThreadOdd(int a){
        this.a = a;
    }
    @Override
    public void run() {

        for (int i=0;i< a ;i++){
            if (i%2!=0){
               synchronized (file){
                   file.list.add(i);
                   System.out.println(Thread.currentThread().getName()+"-->odd");
               }
//                System.out.print(Thread.currentThread().getName()+"    ");
//                System.out.println(i);
            }
        }
    }
}
