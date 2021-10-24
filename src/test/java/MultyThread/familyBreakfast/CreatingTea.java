package MultyThread.familyBreakfast;

public class CreatingTea implements Runnable{

    @Override
    public void run() {
        System.out.println("start creat tea ...........");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("tea is ready");
    }
}
