/*
Jessica Willis
2/27/2026
final
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Jessica Willis - Final Practical Exam\n");

        // Create an instance of Unique class
        Unique uniqueNumbers = new Unique();

        // Get the 5 unique numbers from the user
        uniqueNumbers.getNumbers();

        // Display results
        System.out.println("\nUnique Values Entered: " + uniqueNumbers.getUniqueValues());
        System.out.println("Largest Number: " + uniqueNumbers.getLargestNumber());
        System.out.println("Smallest Number: " + uniqueNumbers.getSmallestNumber());
        System.out.println("Sum of Numbers: " + uniqueNumbers.getSum());
        System.out.println("Average of Numbers: " + uniqueNumbers.getAverage());

        try {
            System.out.println("Last divided by First: " + uniqueNumbers.getLastDividedByFirst());
        } catch (ArithmeticException e) {
            System.out.println("Exception: java.lang.ArithmeticException: / by zero");
            System.out.println("Last divided by First: [Calculation Skipped]");
        }
    }
}
