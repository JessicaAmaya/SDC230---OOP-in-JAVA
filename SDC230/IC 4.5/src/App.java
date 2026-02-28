/*
Jessica Willis
2/27/2026
4.5
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static boolean isValid(int value) throws NumberBetween1and100Exception {
        if (value < 1 || value > 100) {
            throw new NumberBetween1and100Exception("\nValue must be between 1 and 100");
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 4.2");
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int value = 0;

        do {
            System.out.print("\nEnter an Inter 1-100 (-999 to quit): ");
            boolean checkIsValid = false;
            try{
                value = input.nextInt();
                if (value == -999){
                    break;
                }
                checkIsValid = isValid(value);
                if (isValid(value)== true) {
                    intList.add(value);
                    count++;
                    System.out.printf("Current Count: %d%n", count);
                    sum += value;
                    System.out.printf("Current Sum: %d%n", sum);
                }
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                input.nextLine();
                System.out.println("You must enter Integers, try again");
            } catch (NumberBetween1and100Exception e) {
                System.err.printf("%n%s%n", e);
                input.nextLine();
            } finally {
                if (checkIsValid == true) {
                    System.out.println("Input accepted");
                } else {
                    System.err.println("Error Occured, returning to prompt");
                }
            }
        } while (value != -999);
        System.out.println("\n Quitting Program \n");
        System.out.println("\n Stats motherfucker \n");
        for (int i : intList) {
            System.out.println("\t" + i);
        }
        System.out.printf("FInal Count: ", count);
        System.out.printf("FInal Sum: ", sum);
        if (count == 0) {
            System.out.println("No number entered, average is 0 dummy");
        } else {
            System.out.printf("Final Average: %.2f", (double) sum / count);
        }
        input.close();
    }
}
