package ir.pdf4.q2__corrected;

import java.util.Scanner;

public class INTArray {
    int count = 0;
    int counttt = 0;

    int[] array;
    int[] arrayfinal = new int[100];
    Main main= new Main();

    public void addArray() {
        Scanner input = new Scanner(System.in);
        array = new int[++count];
        System.out.println("pleas enter a number :");
//        array[--count] = input.nextInt();
        array[counttt] = input.nextInt();
////        count++;
//        for (int i = counttt; i < c; i++) {
//
//        }

        arrayfinal[counttt] = array[counttt];
        counttt++;
        System.out.println("----------------------------------------------: "+main.type+" finished");
        main.type=" ";
    }

    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter a 'index' of number :");
        int index = input.nextInt();
        int c = 0;
        for (int i = 1; i < array.length - index; i++) {
            array[index + c] = array[index + i];
            c++;
            System.out.println();
        }
        System.out.println("----------------------------------------------: "+main.type+" finished");
        main.type=" ";
    }

//    public int[] list() {
//        for (int i = 0; i < array.length; i++) {
//            return array;
//        }
//        return new int[0];
//    }

    public int[] list() {
        for (int i = 0; i < arrayfinal.length; i++) {
            if (arrayfinal[i]!=0)
            return arrayfinal;
            else continue;
        }
        System.out.println("----------------------------------------------: "+main.type+" finished");
        main.type=" ";
        return null;

    }

}
