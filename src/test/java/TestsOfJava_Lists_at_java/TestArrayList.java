package TestsOfJava_Lists_at_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>ArrayList </b>examples
 * <p>this is example </p>
 */
public class TestArrayList {
    public static void main(String[] args){

        array();

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        ArrayList <Integer> num = new ArrayList<>();
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(58);
        num.add(59);
        num.add(5222);
        System.out.println(num);
        int[] nummmmm= {1,2,3,4,5};


        for (Integer number : num){
            System.out.println(number);
        }
        System.out.println();

        num.set(2,5);
        for (Integer number : num){
            System.out.println(number);
        }

        System.out.println();
        System.out.println("for simple");
        num.add(2,8);
        num.add(3,8);
        for (int i = 0; i <num.size() ; i++) {
            System.out.println(num.get(i));
        }
        System.out.println("-----------------------------------");
        if (num.isEmpty()==false){
            num.add(888888999);
        }
       for (Integer number : num){
           System.out.println(number);
       }
        System.out.println("--------------------------------");
        System.out.println();
        //ArrayList
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(num);
       numbers2.add(12);

       int i =1;
       for (Integer number : numbers2){
           System.out.println(i+"-->"+number);
           i++;
       }

        List.of(nummmmm);


    }
    public static void array(){
        List<Integer> list ;

        Integer[] arr = {2,10,3};

        list = Arrays.asList(arr);

        System.out.println(list);
    }

}
