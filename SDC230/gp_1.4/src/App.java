/************************************************************************** 
 * Jessica Amaya
 * 1/20/2026
 * GP 1.4
*/

public class App {
    public static voice main(String[] args) throws Exception {
        // print a line of text
        System.out.println("Hello, Jessica! Welcome to Java Programming");
        // print a blank line
        System.out.println();
        //print a formated line of text with printf
        System.out.printf("%s%n%s%n%s%d%n%s%.2f%n%s%.2f",
            "A string followed by a new line.",
            "A string followed by a new line.",
            "Decimal (integer) value: ", 4,
            "Floating point number to 2 decimals: ", 3.1415,
            "Floating point number to  2 decimals (rounded): ", 1.199);
    }
}
