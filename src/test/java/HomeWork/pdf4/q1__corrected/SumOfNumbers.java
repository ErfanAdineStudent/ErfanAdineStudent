package HomeWork.pdf4.q1__corrected;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Long sum=0l;
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter a number for Analyze and add figures :");
        Long number = input.nextLong();
        Long[] digit = new Long[25];

        for (int i = 0; i < 25; i++) {
            digit[i] = number % 10;
            number = number / 10;
        }
        for (int i = 24; i >= 0; i--) {
            sum+=digit[i];

        }
        if (sum>99&&sum<1000)
        {
            System.out.print(sum+"------------->");
            for (int i = 0; i < 25; i++) {
                digit[i] = sum % 10;
                sum = sum / 10;
            }
            for (int i = 24; i >= 0; i--) {
                sum+=digit[i];

            }
        }
        if (sum>9&&sum<100)
        {
            System.out.print(sum+"------------->");
            for (int i = 0; i < 25; i++) {
                digit[i] = sum % 10;
                sum = sum / 10;
            }
            for (int i = 24; i >= 0; i--) {
                sum+=digit[i];

            }
            if (sum==10) {
                System.out.print(sum + "------------->");
                sum = 1l;
            }
        }
        System.out.println(sum);
    }
}
