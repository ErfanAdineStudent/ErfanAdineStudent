package MultyThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter a number: ");
        int number = scanner.nextInt();
//        List<Thread> EvenNumbers = new ArrayList<>();
OddNumber oddNumber = new OddNumber();
EvenNumber evenNumber = new EvenNumber();

        for (int i = 0; i < evenNumber.number; i++) {
            Thread threadEvern= new Thread(new EvenNumber(number));
            threadEvern.start();
            try {
                threadEvern.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i <oddNumber.number ; i++) {
            Thread threadOdd =new Thread(new OddNumber(number));
            threadOdd.start();
            try {
                threadOdd.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        for (Thread thread: EvenNumbers) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        for (int i = 0; i <number ; i++) {
//            try {
//                threadEvern.join();
//                threadOdd.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }

    }
}
