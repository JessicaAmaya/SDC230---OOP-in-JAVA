/**
 * jessica Amaya
 * 2/6/2026
 * gp 2.3
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("jessica amaya gp 2.3");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Looping using a while loop.");
        System.out.print("Enter a Grade between 0 and 100 (-1 to stop): ");
        int inVal = input.nextInt();
        int passCount = 0;
        int failCount = 0;

        while(inVal != -1) {
            if(inVal >= 60) {
                passCount++;
            }
            else {
                failCount++;
            }
            System.out.print("Enter a grade between 0 and 100 (-1 to stop): ");
            inVal = input.nextInt();
        }

        System.out.printf("Count of passing grades: %d%n", passCount);
        System.out.printf("Count of failing grades: %d%n", failCount);
        System.out.println("Looping using a do-while loop:");
        passCount = 0;
        failCount = 0;
        do {
            System.out.print("Enter a grade between 0 and 100 (-1 to stop): ");
            inVal = input.nextInt();

            if(inVal >= 60){
                passCount++;
            }
            else if (inVal != -1) {
                failCount++;
            }
        } while (inVal != -1);

        System.out.printf("Count of passing grades: %d%n", passCount);
        System.out.printf("Count of failing grades: %d%n", failCount);
    input.close();
    }
}
