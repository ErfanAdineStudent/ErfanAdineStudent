package ir.pdf5.Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter a number :");
        int n = input.nextInt();
        // ----------------------------------------------------------------write prime number from 1 to 10
//        for (int i = 1; i < 10; i++) {
//            int count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0 && i % 1 == 0)
//                    count++;
//            }
//            if (count == 2)
//                System.out.println(i);
//        }

//----------------------------------------------------------------is this number prime number?
//        Scanner input = new Scanner(System.in);
//        System.out.println(" pleas enter your number :");
//        int number = input.nextInt();
//
//        int count = 0;
//        for (int j = 1; j <= number; j++) {
//            if (number % j == 0 && number % 1 == 0)
//                count++;
//        }
//        if (count == 2)
//            System.out.println(number + "is odd number ");

        primeNumber(n);
    }


    //-------------------------------------------------
    public static int primeNumber(int number) {
        int count = 0;
        for (int j = 1; j <= number; j++) {
            if (number % number == 0 && number % 1 == 0)
                count++;
        }
        if (count == 2)
            System.out.println(number + " is prime number ");
        else System.out.println(number+ "isn't prime number" );

        return number;
    }

}
