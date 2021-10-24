package HomeWork.pdf9.Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> mylist = new ArrayList<>();
        OrderlyPair2 orderlyPair2 = new OrderlyPair2();
        while (true) {
            System.out.print("set mylist --->");
            System.out.println("hello pleas enter character while character = '0' .");
            int digit = input.nextInt();
            if (digit != 0)
                mylist.add(digit);
            else
                break;

        }
//        List l = orderlyPair2.seconde(mylist);
        ArrayList r= removeUglyOrderedPairs(mylist);
        System.out.println(r);


    }

    private static ArrayList<Integer> removeUglyOrderedPairs(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        Integer a = null;
        for (int i = 0; i < list.size(); i++)
            if (i % 2 == 0)
                a = list.get(i);
            else if (a != null && a <= list.get(i)) {
                result.add(a);
                result.add(list.get(i));
                a = null;
            }
        return result;
    }

}
