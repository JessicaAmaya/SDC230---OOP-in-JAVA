/*
Jessica Willis
2/27/2026
5.4
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 5.4");
        System.out.println();
        Animal s = new Animal("Milo", 4);
        Cat r = new Cat("Furgus", 4, "Meow");

        s.printAnimal();
        r.printAnimal();

        
        s.setName("Green");
        s.setLegs(3);
        r.setName("red");
        r.setLegs(2);
        r.setSound("Mrow");
        

        s.printAnimal();
        r.printAnimal();
    }
}

