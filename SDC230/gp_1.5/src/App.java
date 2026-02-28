/**
 * Jessica Amaya
 * 1/30/2026
 * gp 1.5
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya - week 1 GP 1.5");
        System.out.println();
        int intVal1 = 0;
        int intVal2 = 5;
        int intVal3 = 5;

        if (intVal2 == intVal3) {
            System.out.printf("%d is equal to %d%n", intVal2, intVal3);
        }
        if (intVal1 != intVal3) {
            System.out.printf("%d is not equal than %d%n", intVal1, intVal3);
        }
        if (intVal1 < intVal3) {
            System.out.printf("%d is less than %d%n", intVal1, intVal3);
        }
        if (intVal2 > intVal1) {
            System.out.printf("%d is greater than %d%n", intVal2, intVal1);
        }
        if (intVal2 <= intVal3) {
            System.out.printf("%d is less than or equal to %d%n", intVal2, intVal3);
        }
        if (intVal2 >= intVal3) {
            System.out.printf("%d is greater than or equal to %d%n", intVal2, intVal3);
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter an integer value: ");
        intVal1 = input.nextInt();
        System.out.println("Enter a second integer value: ");
        intVal2 = input.nextInt();
        int sum = intVal1 + intVal2;
        System.out.printf("The sum of %d and %d is %d.%n", intVal1, intVal2, sum);
        System.out.println();
        System.out.println("Enter a floating point value: ");
        double fltVal1 = input.nextDouble();
        System.out.println("Enter a second floating point value: ");
        double fltval2 = input.nextDouble();
        double total = fltVal1 + fltval2;
        System.out.printf("The sum of %.3f and %.3f is %.3f%n", fltVal1, fltval2, total);
    input.close();    
    }
}
