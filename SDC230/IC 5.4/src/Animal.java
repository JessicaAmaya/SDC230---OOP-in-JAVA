/*
Jessica Willis
2/27/2026
5.4
*/

public class Animal {
    public String Name;
    public int Legs;

    public Animal(String name, int legs) {
        Name = name;
        Legs = legs;
    }

    public String getName() {
        return Name;
    }

    public void setName (String name) {
        Name = name;
    }

    public int getLegs() {
        return Legs;
    }

    public void setLegs (int legs) {
        Legs = legs;
    }

    public void printAnimal() {
        System.out.printf("The animals's name is %s and it has %d legs.%n", Name, Legs);
    }
}
