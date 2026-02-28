/*
Jessica Willis
2/27/2026
4.6
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static boolean isValid(int value) throws NumberOutOfRangeException {
        if (value < 1 || value > 100) {
            throw new NumberOutOfRangeException("\nValue must be between 1 and 100");
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 4.6");
        System.out.println();
        Scanner input = new Scanner(System.in);
        boolean checkIsValid = false;
        do {
            System.out.print("\nEnter your age 1-100: ");
            try{
                int age= input.nextInt();
                checkIsValid = isValid(age);
                if (isValid(age)== true) {
                   System.out.printf("%nAge Entered: %d", age);
                }
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                input.nextLine();
                System.out.println("You must enter Integers, try again");
            } catch (NumberOutOfRangeException e) {
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
        }while (checkIsValid == false);
        input.close();
    }
}
