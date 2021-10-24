package MultyThread;

import java.util.ArrayList;

public class OddNumber implements Runnable {
    int number;
    public OddNumber(int n) {
        number=n;
    }
    public OddNumber(){

    }

    @Override
    public void run() {
        ArrayList<Integer> listodd = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (i% 2!=0){
                listodd.add(i);

            }
        }
//        Thread.sleep();
        for (int i = 0; i < number; i++) {
            System.out.println(listodd.get(i));
        }
    }
}
