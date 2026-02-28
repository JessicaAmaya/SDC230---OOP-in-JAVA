/*
Jessica Willis
2/27/26
2.7
smallest number
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 2.7");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of intgers you will enter: ");
        int choice = input.nextInt();
        int count = 1;
        int smallest = 0;
        System.out.print("Please enter the first integer: ");
        int entry = input.nextInt();
        smallest = entry;
        do { 
            if (smallest > entry) {
                    smallest = entry;
            }
            else;
            count++;
            System.out.print("Please enter the next integer: ");
            entry = input.nextInt();
        } while (count < choice);
        System.out.printf("The smallest integer printed was: %d", smallest);
        input.close();
    }
}
