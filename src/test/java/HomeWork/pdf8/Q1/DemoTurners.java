package HomeWork.pdf8.Q1;

//import com.DonUp.ir.pdf8.Q1.Leaf.java.Leaf;
//import com.DonUp.ir.pdf8.Q1.Page.java.Page;
//import com.DonUp.ir.pdf8.Q1.Pancake.java.Pancake;
//import com.DonUp.ir.pdf8.Q1.myClass1.MyClass1;
//import com.DonUp.ir.pdf8.Q1.myClass2.MyClass2;

public class DemoTurners {
    public static void main(String[] args){
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        //----------------------------------
        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();

        leaf.turn();
        page.turn();
        pancake.turn();
        System.out.println("---------------------------------");
        myClass1.turn();
        myClass2.turn();

    }
}
