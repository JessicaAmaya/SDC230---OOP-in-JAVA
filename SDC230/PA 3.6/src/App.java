/*
Jessica Willis
2/27/2026
3.6
calculations and unique numbers
*/
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 3.6");
        System.out.println();
        
        int[] intArr = new int[10];
        Scanner input = new Scanner(System.in);
        
        // Create the unique list outside the loop to accumulate unique numbers
        ArrayList<Integer> unique = new ArrayList<>();
        
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("Please enter an integer: ");
            intArr[i] = input.nextInt();
            
            // Add to the unique list only if it's not already contained
            if (!unique.contains(intArr[i])) {
                unique.add(intArr[i]);
            }
        }
        
        System.out.println();
        int arrayCount = intArr.length;
        int arraySum = sum(intArr);
        double arrayAvg = (double) arraySum / arrayCount;

        int listCount = unique.size();
        int listSum = sum(unique);
        double listAvg = (double) listSum / listCount;

        System.out.println("\n --- Array Stats : all 10 ---\n");
        System.out.printf("\tCount: %d\n", arrayCount);
        System.out.printf("\tSum: %d\n", arraySum);
        System.out.printf("\tAverage: %.2f\n", arrayAvg);

        System.out.println("\n --- Array Stats : Unique ---\n");
        System.out.printf("\tCount: %d\n", listCount);
        System.out.printf("\tSum: %d\n", listSum);
        System.out.printf("\tAverage: %.2f\n", listAvg);

        input.close();
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        return total;
    }

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int x : list) {
            total += x;
        }
        return total;
    }
}