/*
Jessica Amaya
2/23/2026
pa 1.9
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 1.9");
        System.out.println();

        Employee acct1 = new Employee("John", "Jones", 0);
        Employee acct2 = new Employee("Jane", "Jamison", 2500);

        System.out.printf("%n%s %s%n Monthly Salary: $%.2f%n",
            acct1.getFirstName(), acct1.getLastName(), acct1.getSalary());
        System.out.printf("\"%n%s %s%n Monthly Salary: $%.2f%n\"",
            acct2.getFirstName(), acct2.getLastName(), acct2.getSalary());
        System.out.println();
        acct1 = new Employee("John", "Smith", 1500);
        acct2 = new Employee("Janey", "Jamison", 2750);
        System.out.printf("%n%s %s%n Monthly Salary: $%.2f%n",
            acct1.getFirstName(), acct1.getLastName(), acct1.getSalary());
        System.out.printf("%n%s %s%n Monthly Salary: $%.2f%n",
            acct2.getFirstName(), acct2.getLastName(), acct2.getSalary());
    }
}
