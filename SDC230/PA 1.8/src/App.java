/*
Jessica Amaya
2/23/2026
PA 1.8 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 1.8");
         System.out.println();
        int intVal1 = 0;
        int intVal2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter an integer value: ");
        intVal1 = input.nextInt();
        System.out.println("Enter a second integer value: ");
        intVal2 = input.nextInt();
        int sum = intVal1 + intVal2;
        System.out.printf("The sum of %d and %d is %d.%n", intVal1, intVal2, sum);
         if (intVal1 == intVal2) {
            System.out.printf("%d is equal to %d%n", intVal1, intVal2);
        }
        else {
            System.out.printf("%d is not equal to %d%n", intVal1, intVal2);
        }
          if (intVal1 > intVal2) {
            System.out.printf("%d is Greater than %d%n", intVal1, intVal2);
        }
        else {
            System.out.printf("%d is Less than %d%n", intVal1, intVal2);
        }
          if (intVal1 >= intVal2) {
            System.out.printf("%d is Greater than or equal to %d%n", intVal1, intVal2);
        }
        else {
            System.out.printf("%d is less than or equal to %d%n", intVal1, intVal2);
        }

        System.out.println();
        System.out.println("Enter a floating point value: ");
        double fltVal1 = input.nextDouble();
        System.out.println("Enter a second floating point value: ");
        double fltval2 = input.nextDouble();
        double total = fltVal1 + fltval2;
        System.out.printf("The sum of %.4f and %.4f is %.4f%n", fltVal1, fltval2, total);
          if (fltVal1 == fltval2) {
            System.out.printf("%.4f is equal to %.4f%n", fltVal1, fltval2);
        }
        else {
            System.out.printf("%.4f is not equal to %.4f%n", fltVal1, fltval2);
        }
          if (fltVal1 > fltval2) {
            System.out.printf("%.4f is Greater than%.4f%n", fltVal1, fltval2);
        }
        else {
            System.out.printf("%.4f is Less than%.4f%n", fltVal1, fltval2);
        }
          if (fltVal1 >= fltval2) {
            System.out.printf("%.4f is Greater than or equal to %.4f%n", fltVal1, fltval2);
        }
        else {
            System.out.printf("%.4f is less than or equal to %.4f%n", fltVal1, fltval2);
        }
    input.close();    
    }
}
