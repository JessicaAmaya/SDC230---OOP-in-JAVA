/*
Jessica Amaya
2/13/2026
IC 3.5
*/

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 3.5");
        System.out.println();
        double[] productPrices = {0, 2.98, 4.50, 9.98, 4.49, 6.87};
        String[] productNames = {"", "Wireless Mouse", "USB-C Cable", "Laptop Stand", "LED Desk Lamp", "Web Camera"};
        double totalSales = 0.00;
        int salesCount = 0;
        double averageTransAmount = 0.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the product number 1 - 5 (-999 to Quit): ");
        int choice = input.nextInt();
        do {
            while (choice > 0 && choice < 6){
                System.out.printf("Enter Quantity sold for %s: ", productNames[choice]);
                int amount = input.nextInt();
                while (amount < 0) {
                    System.out.println("Error: Quantity must be greater than 0");
                    System.out.printf("Enter Quantity sold for %s: ", productNames[choice]);
                    amount = input.nextInt();
                }
                double saleTotal = amount * productPrices[choice];
                System.out.printf("Added: %d x %s @ %.2f = %.2f", amount, productNames[choice], productPrices[choice], saleTotal);
                salesCount++;
                totalSales = totalSales + saleTotal;
                System.out.println();
                System.out.print("Please enter the product number 1 - 5 (-999 to Quit): ");
                choice = input.nextInt();
            }
            if (choice > 5) {
                System.out.println("Please choose a Valid product number");
                System.out.println();
                System.out.print("Please enter the product number (1 - 5) or -999 to quit: ");
                choice = input.nextInt();
            }
            else;
        } while (choice != -999);
        System.out.println("-------------------------------------------");
        System.out.printf("Final total sales: $%.2f%n", totalSales);
        averageTransAmount = (double) totalSales / salesCount;
        System.out.printf("Average Transaction Amount: $%.2f", averageTransAmount);
        input.close();
    }
}
