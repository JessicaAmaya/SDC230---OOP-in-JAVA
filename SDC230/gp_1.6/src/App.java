/**
 * jessica amaya
 * 10/30/2026
 * gp 1.6
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Jessica Amaya - Week 1 GP Account Class");

        Account acct1 = new Account("Jane Green", 50.00);
        Account acct2 = new Account("John Blue", -7.53);

        System.out.printf("%n%s balance: $%.2f%n",
            acct1.getName(), acct1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            acct2.getName(), acct2.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter deposit amount for Jane's account: $");
        double deposit = input.nextDouble();
        System.out.printf("%nAdding $%.2f to Jane's account%n%n", deposit);
        acct1.deposit(deposit);
        System.out.print("Enter deposit ammount for John's Account: $");
        deposit = input.nextDouble();
        System.out.printf("%nAdding $%.2f to John's account%n%n", deposit);
        acct2.deposit(deposit);
        System.out.printf("%s balance: $%.2f%n",
            acct1.getName(), acct1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            acct2.getName(), acct2.getBalance());
    input.close();
    }
}
