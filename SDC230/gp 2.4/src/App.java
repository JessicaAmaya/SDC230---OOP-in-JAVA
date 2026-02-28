/**
 * Jessica amaya
 * 2/6/2026
 * gp 2.4
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("jessica amaya gp 2.4");
        System.out.println();
        int c = 5;
        System.out.printf("Value of c before prefix increment: %d%n", c);
        System.out.printf("Value of c with prefix increment(++c): %d%n", ++c);
        System.out.printf("Value of c after prefix increment: %d%n", c);

        c = 5;
        System.out.printf("Value of c before prefix decrement: %d%n", c);
        System.out.printf("Value of c with prefix decrement (--c): %d%n", --c);
        System.out.printf("Value of c after prefix decrement: %d%n", c);

        c = 5;
        System.out.printf("Value of c before suffix increment: %d%n", c);
        System.out.printf("Value of c with suffix increment(c++): %d%n", c++);
        System.out.printf("Value of c after suffix increment: %d%n", c);

        c = 5;
        System.out.printf("Value of c before suffix decrement: %d%n", c);
        System.out.printf("Value of c with suffix decrement (c--): %d%n", c--);
        System.out.printf("Value of c after suffix decrement: %d%n", c);

        System.out.println("Counter-Controlled while loop demonstration");
        int wcnt1 = 1;
        while (wcnt1 <= 10) {
            System.out.printf("%d ", wcnt1);
            wcnt1++;
        }
        System.out.printf("%n%n");
        System.out.println("For loop demonstration");
        for (int cnt =1; cnt <= 10; cnt++) {
            System.out.printf("%d ", cnt);
        }
        System.out.printf("%n%n");
        System.out.println("for loop countdown");
        for (int cnt = 10; cnt >= 0; cnt--) {
            System.out.printf("%d ", cnt);
        }
    }
}
