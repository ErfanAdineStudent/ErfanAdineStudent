package MultyThread.familyBreakfast;

import jdk.nashorn.api.tree.SpreadTree;

public class MainFamilyBreakFast {
    public static void main(String[] args) {
        Thread son = new Thread(new ByingBread());
        son.start();
        Thread mom = new Thread(new CreatingTea());
        mom.start();

        try {
            son.join();
            mom.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dad and duther can come to kitchen for eating breakfast ..................");

    }
}
