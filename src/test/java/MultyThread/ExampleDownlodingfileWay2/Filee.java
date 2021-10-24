package MultyThread.ExampleDownlodingfileWay2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Filee {
    private int bysize=0;
    private Lock lock = new ReentrantLock();

    public void increas(){
        System.out.println(getbysize()+"hello");

        lock.lock();
        try {
            bysize++;
        }finally {

            lock.unlock();
        }
    }

    public int  getbysize(){
        return bysize;
    }
}
