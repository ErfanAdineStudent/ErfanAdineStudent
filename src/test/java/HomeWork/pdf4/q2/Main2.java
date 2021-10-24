package HomeWork.pdf4.q2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Arrayl array = new Arrayl();
        Scanner input = new Scanner(System.in);

        System.out.println("0 = exit");
        System.out.println("1= add number ");
        System.out.println("2= search index number");
        System.out.println("3= remove number");
        System.out.println("4 = print");


        String type;


        while (true) {
            System.out.println("pleas Enter type:");
            type = input.next();
            if (type.equals("0")) {
                break;

            } else if (type.equals("1")) {
                System.out.print("Enter : ");
                array.add();
                System.out.println("---------------");
                type = "";
            } else if (type.equals("2")) {
                array.indexof();
                System.out.println("---------------");
                type = "";
            } else if (type.equals("3")) {
                array.remove();
                System.out.println("---------------");
                type = "";
            } else if (type.equals("4")) {
                array.print();
                System.out.println("---------------");
                type = "";
            }

        }


    }
}


