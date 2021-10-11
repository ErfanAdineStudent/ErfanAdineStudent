package TestsOfJava_Lists_at_java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestOfSet {


    static Set<Integer> set;
    public static void main(String[] args){

//        Set<Integer> set = new HashSet<>();
    //---------------------------------------
      //  String[] h = {"salam","erfan","welcom"};
        //test(h);
        addset(1);
        addset(2);
        addset(1);
        printSet();
    }


    /**
     * <p>test of Array String </p>
     * @param hell
     */
    public static void test(String[] hell){
        for (String name : hell) {
            System.out.println(name+"-->1");
            System.out.println();
        }
    }

    /**
     * <b>my method set</b>
     * @param a
     */

    public  static void addset(int a ){

        set = new HashSet<>();
        set.add(a);
    }
    public  static void printSet(){
        for (Integer number : set)
            System.out.println(number);
    }

    /**
     * <b>
     *     Scan from input
     * </b>
     * @return
     */
    public static int scanInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    } public static int scanDouble(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    } public static int scanString(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
