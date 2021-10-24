package HomeWork.pdf4.q3;

public class CalculatProfit {
//    int[] arrry = {7, 1, 5, 3, 6, 4};
    int[] arrry = {7,6,4,3,1};
    int output = 5;
    int count = 0;

    public void calculat() {
        for (int i = 0; i < arrry.length; i++) {
            for (int j = 0; j < arrry.length; j++) {
               if ((i != 1 && j != 0))
                continue;
                if (arrry[j] - arrry[i] == output) {
                    System.out.println("Buy on day " + (i + 1) + "(price=" + arrry[i] + ")" + " and sell on day " + (j + 1) + "(price = " + arrry[j] + ") ," + "profit = " + arrry[j] + "-" + arrry[i] + " =" + output);
                    count++;
                }
            }

        }
        if (count == 0)
            System.out.println("0");

    }
}
