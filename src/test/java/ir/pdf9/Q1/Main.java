package ir.pdf9.Q1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> a = new TreeSet<>();
        Set<Character> b = new TreeSet<>();
        while (true) {
            System.out.println("set a");
            System.out.println("hello pleas enter character while character = '0' .");
            String letter = input.next();
            Character c =letter.charAt(0);
            if (c!='0')
                a.add(c);
            else
                break;

        }   while (true) {
            System.out.println("set b");
            System.out.println("hello pleas enter character while character = '0' .");
            String letter = input.next();
            Character c =letter.charAt(0);
            if (c!='0')
                b.add(c);
            else
                break;

        }

        CommunityAndSubscription cas = new CommunityAndSubscription();
        cas.firstMethod(a,b);
        System.out.println("---------------------------------------------");
        cas.secondMethod(a,b);


    }
}
