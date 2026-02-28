/*
Jessica Willis
2/27/2026
4.7
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static boolean isValid(int tempTotal) throws NumberOutOfRange {
        if (tempTotal < 0) {
            throw new NumberOutOfRange("\nAccount cannot be negative");
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 4.7");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the account starting total: ");
        int total = input.nextInt();
        int tempTotal = 0;
        int value = 0;
        boolean checkIsValid = false;
        do {
            System.out.print("\nEnter your credit or deposit (enter 0 to quit): ");
            try{
                value = input.nextInt();
                if (value != 0) {
                    tempTotal = total + value;
                    checkIsValid = isValid(tempTotal);
                    if (isValid(value)== true) {
                        total = total + value;
                        System.out.printf("%nnew account total: %d", total);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                input.nextLine();
                System.out.println("You must enter Integers, try again");
            } catch (NumberOutOfRange e) {
                System.err.printf("%n%s%n", e);
                input.nextLine();
            } finally {
                if (checkIsValid == true) {
                    System.out.println("Input accepted");
                } else {
                    System.err.println("Error Occured, returning to prompt");
                    checkIsValid = false;
                }
            }
        }while (value != 0);
        input.close();
    }
}
