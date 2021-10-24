package MultyThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Mythrad mythrad =new Mythrad();
            mythrad.setPriority(Thread.MAX_PRIORITY);
            mythrad.start();
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < 5; i++) {
            Mythrad thread =new Mythrad();
             thread.setPriority(Thread.MIN_PRIORITY);
            thread.start();
        }


//        System.out.println("salame");
//        Thread thread = new Thread(new MyRunnable1());
//        thread.start();
//        System.out.println("khodafez");
//
//
    }

}
