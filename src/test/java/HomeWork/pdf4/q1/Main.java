package HomeWork.pdf4.q1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            // write your code here
        System.out.println(Math.pow(2,5));
            Scanner input = new Scanner(System.in);
            int sum = 0;
            System.out.println("pleas Enter a number: ");
            String digit = input.next();
            char array[] = digit.toCharArray();
            int[] numArray = new int[digit.length()];
//        char[] array=new char[digit.length()];
            for (int i = 0; i < digit.length(); i++) {
                if (digit.length() >= 0) {
                    numArray[i] = Integer.parseInt(array[i] + "");
                    sum += numArray[i];
                } else continue;

            }
            if (sum > 9) {
                String num2 = sum + "";
                int sum2 = 0;
                char[] num2array = num2.toCharArray();
                for (int i = 0; i < num2.length(); i++) {
                    sum2 += Integer.parseInt(num2array[i] + "");
                }
                System.out.println(sum + "--------------------->" + sum2);
            } else System.out.println("sum is :" + sum);
        }

    }

