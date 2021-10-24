package ir.pdf11.Q1;

public class Main {
    private static File file = new File();
    public static void main(String[] args) {
        Thread threadOdd = new Thread(new ThreadOdd(10));
        Thread threadEvent = new Thread(new ThreadEven(10));

        threadEvent.start();
        threadOdd.start();


        try {
            threadEvent.join();
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        for (int a:file.list) {
//            System.out.println(a);
//        }

        /**
         * this print work with <B>String.valueOf(list);</B>
         */
        System.out.println(file);


    }
}
