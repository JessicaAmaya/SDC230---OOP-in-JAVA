/*
jessica Willis
2.6
2/27/26
calculations
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("jessica willis 2.6");

        int wcnt1 = 1;
        int total = 0;
        while (wcnt1 <= 10) {
            total = total + wcnt1;
            System.out.printf("Total is %d%n", total);
            wcnt1++;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 100 (-1 to stop): ");
        int inVal = input.nextInt();
        int count1 = 0;
        int sum = 0;

        while(inVal != -1) {
            count1++;
            sum = sum + inVal;
            System.out.printf("The current total is: %d", sum);
            System.out.print("Enter an integer between 0 and 100 (-1 to stop): ");
            inVal = input.nextInt();
        }
        System.out.printf("The total count is %d and the total sum is %d", count1, sum);
    input.close();
    }
}
