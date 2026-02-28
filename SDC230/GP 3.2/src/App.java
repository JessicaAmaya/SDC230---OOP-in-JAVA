/*
Jessica Amaya
2/13/2026 (it's my birthdayyyyyy)
gp 3.2
*/
import java.util.Scanner;

public class App {
    private static String label = "The maximum value is: ";
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 3.2");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 floating-point values separated by spaces: ");
        double f1 = input.nextDouble();
        double f2 = input.nextDouble();
        double f3 = input.nextDouble();
        displayMessage(maxOfThree(f1,f2,f3));
        System.out.print("Enter 3 integer values separated by spaces: ");
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        int i3 = input.nextInt();
        displayMessage(maxOfThree(i1,i2,i3));
        input.close();
    }
    public static void displayMessage(double val) {
        System.out.printf("%s%.2f%n", label, val);
    }

    public static void displayMessage(int val) {
        System.out.printf("%s%d%n", label, val);
    }

    public static double maxOfThree(double x, double y, double z) {
        double maximumValue = Math.max(x, y);
        return Math.max(maximumValue, z);
    }
    public static int maxOfThree(int x, int y, int z) {
        int maximumValue = Math.max(x, y);
        return Math.max(maximumValue, z);
    }
}
