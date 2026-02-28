/*
Jessica Willis
2/27/2026
final
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    private ArrayList<Integer> uniqueValues = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void getNumbers() {
        System.out.println("Please enter 5 unique integers between 0 and 100.");

        // Loop until we get 5 unique numbers
        while (uniqueValues.size() < 5) {
            try {
                System.out.print("Enter number #" + (uniqueValues.size() + 1) + ": ");
                String userInput = input.nextLine();

                // Try parsing the input as an integer
                int num = Integer.parseInt(userInput);

                // Check if the number is within the valid range
                if (num < 0 || num > 100) {
                    throw new FinalOutOfRange("Value " + num + " is out of range (0-100).");
                }

                // Check for uniqueness
                if (uniqueValues.contains(num)) {
                    System.out.println("Number already entered. Please provide a unique value.");
                } else {
                    uniqueValues.add(num);
                }
            } catch (NumberFormatException e) {
                // Handle non-integer input
                System.out.println("Exception: java.util.InputMismatchException");
                System.out.println("Error: You must enter an integer. Please try again.");
            } catch (FinalOutOfRange e) {
                // Handle out of range values
                System.out.println("Exception: FinalOutOfRange: " + e.getMessage());
            }
        }
    }

    // Returns the list of unique values entered
    public ArrayList<Integer> getUniqueValues() {
        return uniqueValues;
    }

    // Returns the largest number
    public int getLargestNumber() {
        int largest = Integer.MIN_VALUE;
        for (int num : uniqueValues) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    // Returns the smallest number
    public int getSmallestNumber() {
        int smallest = Integer.MAX_VALUE;
        for (int num : uniqueValues) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    // Returns the sum of all numbers
    public int getSum() {
        int sum = 0;
        for (int num : uniqueValues) {
            sum += num;
        }
        return sum;
    }

    // Returns the average of the numbers
    public double getAverage() {
        return (double) getSum() / uniqueValues.size();
    }

    // Returns the last number divided by the first number
    public double getLastDividedByFirst() {
        if (uniqueValues.get(0) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) uniqueValues.get(uniqueValues.size() - 1) / uniqueValues.get(0);
    }
}
