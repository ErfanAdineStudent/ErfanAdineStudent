package MultyThread.ExampleDownlodingfileWay3and;

import MultyThread.ExampleDownlodingfile.DownlodingFile;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownlodingFile3());
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("STOPED............!");


    }
}
