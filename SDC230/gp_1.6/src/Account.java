/***
 * Jessica Amaya
 * 10/30/2026
 * gp 1.6
 */

public class Account{
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return this.balance;
    }
    public void deposit(double ammount) {
        if (ammount > 0.0) {
            balance += ammount;
        }
    }
}
