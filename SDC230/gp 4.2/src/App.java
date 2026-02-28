/*
Jessica Willis
2/27/2026
4.2
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 4.2");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        do{
            try{ 
                System.out.print("Please enter an integer numerator: ");
                int numerator= scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator= scanner.nextInt();
                int res = quotient(numerator, denominator);
                System.out.printf("%nRsult: %d / %d = %d%n", numerator, denominator, res);
                cont = false;
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.println("You must enter integers. Please try again");
            } catch (ArithmeticException e) {
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.println("Zero is an invalid denominator. Please try again");
            }
        } while (cont);
        System.out.println("Here's what would have happened with no ecveption handling:");
        System.out.println();
        System.out.print("Please enter an integer numerator: ");
        int numerator= scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator= scanner.nextInt();
        int res = quotient(numerator, denominator);
        System.out.printf("%nRsult: %d / %d = %d%n", numerator, denominator, res);

    }
}
