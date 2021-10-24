package ir.pdf11.Q1;

public class ThreadEven implements Runnable {
    private static File file = new File();
    int a;

    public ThreadEven(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                synchronized (file){
                    file.list.add(i);
                    System.out.println(Thread.currentThread().getName()+"-->Even");
                }
            }
        }
    }
}
