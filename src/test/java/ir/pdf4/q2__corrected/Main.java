package ir.pdf4.q2__corrected;

import java.util.Scanner;

public class Main {
    static String type = " ";

    public static void main(String[] args) {
//        String type = " ";
        INTArray intArray = new INTArray();

        System.out.println("0= exit");
        System.out.println("1= add");
        System.out.println("2= remove");
        System.out.println("3= show list number");


        while (true) {
            type = scannString();

            if (type.equals("0")) {
                break;
            }
            if (type.equals("1")) {
                intArray.addArray();
            }
            if (type.equals("2")) {
                intArray.remove();
            }
            if (type.equals("3")) {

////                 String[] a =intArray.list();
//                for (int i = 0; i < intArray.array.length; i++) {
//                    System.out.println(intArray.list());
//                }


                int c = 1;
                int i = 0;
                if (intArray.list() != null) {
                    for (int temp : intArray.list()) {
                        if (intArray.list() != null) {
                            intArray.array[i] = temp;
                            System.out.println(c + ": " + intArray.array[i]);
                            c++;
                            i++;
                        }
                    }
                } else System.out.println();


            }
        }

    }

    public static String scannString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
