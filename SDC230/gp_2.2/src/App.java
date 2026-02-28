/***
 * Jessica Amaya
 * 2/6/2026
 * GP 2.2
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya week 2 GP 2.2");
        System.out.println();
        System.out.printf(
            "Conditional AND (&&):%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
            "False && False", false && false,
            "false && true", false && true,
            "True && false", true && false,
            "true && true", true && true);
        System.out.printf(
            "Conditional OR (||):%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
            "False || False", false || false,
            "false || true", false || true,
            "True || false", true || false,
            "true || true", true || true);
        System.out.printf(
            "Logical AND (&):%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
            "False & False", false & false,
            "false & true", false & true,
            "True & false", true & false,
            "true & true", true & true);
        System.out.printf(
            "Logical Inclusive OR (|):%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
            "False | False", false | false,
            "false | true", false | true,
            "True | false", true | false,
            "true | true", true | true);
        System.out.printf(
            "Logical Exclusive OR (^):%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
            "False ^ False", false ^ false,
            "false ^ true", false ^ true,
            "True ^ false", true ^ false,
            "true ^ true", true ^ true);
        System.out.printf(
            "Logical negation (!):%n%s: %b%n%s: %b%n",
            "!false", !false,
            "!true", !true);
        
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter an integer grade in range 0 - 100: ");
        int grade = input.nextInt();
        System.out.println("Determining grade using if_else:");
        if(grade >= 90) {
            System.out.println("The grade entered is an A.");
        }
        else if(grade >= 80) {
            System.out.println("The grade entered is a B.");
        }
         else if(grade >= 70) {
            System.out.println("The grade entered is a C.");
        }
         else if(grade >= 60) {
            System.out.println("The grade entered is a D.");
        }
         else  {
            System.out.println("The grade entered is an F.");
        }

        System.out.println("Determining grade using switch: ");
        switch (grade/10) {
            case 9:
            case 10:
                System.out.println("The grade entered is an A.");
                break;
            case 8:
                System.out.println("The grade entered is a B.");
                break;
            case 7:
                System.out.println("The grade entered is a C.");
                break;
            case 6:
                System.out.println("The grade entered is a D.");
                break;
            default:
                System.out.println("The grade entered is an F.");
                break;
        }
    input.close();
    }
}
