/*
Jessica Willis
2/27/2026
5.4
*/

public class Cat extends Animal {
    private String Sound;

    public Cat(String name, int legs, String sound) {
        super(name, legs);
        Sound = sound;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }

    @Override
    public void printAnimal() {
        System.out.printf("The animals's name is %s and it has %d legs and makes %s sound.%n",
         Name, Legs, Sound);
    }
}
