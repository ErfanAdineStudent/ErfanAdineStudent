package ir.pdf4.q2;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrayl {

    ArrayList list = new ArrayList();
    String type;
        Scanner input = new Scanner(System.in);

        public void add() {
            int a = input.nextInt();
            System.out.println("add :");
            list.add(a);
            type="";
        }

        public void indexof(){
            System.out.println("pleas Enter your 'number' for say index of number : ");
            int b = input.nextInt();
            System.out.println(list.indexOf(b));
            type="";
        }
        public void remove(){
            System.out.println("pleas Enter index of number for remove that :");//عدصرn ام را چاپ کن
            int c = input.nextInt();
            list.remove(c);
            type="";
        }
        public void print(){
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            type="";

        }


}
