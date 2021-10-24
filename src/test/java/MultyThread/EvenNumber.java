package MultyThread;

import java.util.ArrayList;

public class EvenNumber implements Runnable {
    int number;
    public EvenNumber(int n) {
        number=n;
    }

    public EvenNumber(){

    }

    @Override
    public void run() {
        ArrayList<Integer> listeven = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (i% 2==0){
                listeven.add(i);
            }

        }
//        Thread.sleep();
        for (int i = 0; i < number; i++) {
            System.out.println("even "+i+"-->"+listeven.get(i));
        }
    }
}
