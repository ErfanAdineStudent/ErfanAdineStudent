package MultyThread.ExampleDownlodingfileWay2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        ArrayList<DownlodingFile> downlodingFileArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            DownlodingFile task = new DownlodingFile();
            downlodingFileArrayList.add(task);
            Thread thread = new Thread(task);
            threadList.add(thread);
            thread.start();

        }

        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int sum = 0;
        for (DownlodingFile d : downlodingFileArrayList) {
            sum += d.getFile().getbysize();

        }
        System.out.println(sum);

    }
}
