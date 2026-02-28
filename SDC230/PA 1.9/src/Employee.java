/*
Jessica Amaya
2/23/2026
pa 1.9
Employee class takes in names and salary
*/


public class Employee {
    private String firstName;
    private String lastName;
    private float salary;
    public Employee(String firstName, String lastName, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary > 1000) {
            this.salary = salary;
        }
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public float getSalary() {
        return this.salary;
    }
}
