package MultyThread.familyBreakfast;

public class ByingBread implements Runnable{
    @Override
    public void run() {
        System.out.println("boy went to by bread ...........");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("bread is ready");
    }
}
