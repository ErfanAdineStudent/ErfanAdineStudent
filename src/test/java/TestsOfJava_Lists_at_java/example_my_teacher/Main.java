package TestsOfJava_Lists_at_java.example_my_teacher;

import java.net.ProxySelector;

public class Main {
    public static void main(String[] args){
        Grocery grocery = new Grocery("supermurcet");

        Product milk = new Product(1,"pak");
        Product ice = new Product(2,"mihan");
        Product milk1 = new Product(1,"pak");

        grocery.addItem(milk);
        grocery.addItem(ice);
        grocery.addItem(milk1);

        grocery.print();

        grocery.remove(milk);


    }
}
