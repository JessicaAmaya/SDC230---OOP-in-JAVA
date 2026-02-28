/*
Jessica Amaya
2/13/2026
gp 3.3
*/
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 3.3");
        int[] intArr = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("%5d%8d%n", i, intArr[i]);
        }
        ArrayList<Integer> intList = new ArrayList<Integer>();
        System.out.printf("%nLength of ArrayList: %d%n", intList.size());
        String[] animalsArr = {"Dog", "Cat", "GOldfish", "Parrot", "Sloth"};
        System.out.printf("%nArray Length: %d%n", animalsArr.length);
        for (String s : animalsArr) {
            System.out.println(s);
        }
        ArrayList<String> animalsList = new ArrayList<String>() {
            { 
                add("Dog");
                add("Cat");
                add("Goldfish");
                add("Parrot");
                add("Sloth");
            }
        };
        System.out.printf("%nArrayList Length %d%n", animalsList.size());
        animalsList.add("Elephant");
        animalsList.add("Lion");
        System.out.printf("%nArrayList Length after adding Elements %d%n", animalsList.size());
        for (String s : animalsList) {
            System.out.println(s);
        }
    }
}
