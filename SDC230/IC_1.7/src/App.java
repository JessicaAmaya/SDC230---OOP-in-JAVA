

/**
 * jessica amaya
 * 1/30/2026
 * IC 1.7
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya - IC 1.7");
        Car car1 = new Car("Toyota Camry", 15.8, 32.0);
        Car car2 = new Car("Ford F-150", 26.0, 20.0);

        System.out.println("--- Initial Vehicle Data ---");
        System.out.println();
        System.out.printf("Model: %s | MPG: %.1f | Range: %.2f%n", car1.getModel(), car1.getMilesPerGallon(), car1.getTotalRange());
        System.out.printf("Model: %s | MPG: %.1f | Range: %.2f%n", car2.getModel(), car2.getMilesPerGallon(), car2.getTotalRange());
        System.out.println();
        
        System.out.println(" --- Upated Vehicle Data (After tune up) ---");
        System.out.println();
        car1.setMilesPerGallon(car1.getMilesPerGallon()*1.1);
        car2.setMilesPerGallon(car2.getMilesPerGallon()*1.1);
        car1.setModel("Camry Hybrid");
        System.out.printf("Model: %s | MPG: %.1f | Range: %.2f%n", car1.getModel(), car1.getMilesPerGallon(), car1.getTotalRange());
        System.out.printf("Model: %s | MPG: %.1f| Range: %.2f%n", car2.getModel(), car2.getMilesPerGallon(), car2.getTotalRange());
    }
}
