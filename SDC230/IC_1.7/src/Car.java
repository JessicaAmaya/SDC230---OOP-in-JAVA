/**
 * Jessica Amaya
 * 1/30/2026
 * IC 1.7
 */

public class Car{
    private String model;
    private double fuelCapacity;
    private double milesPerGallon;
    public Car(String model, double fuelCapacity, double milesPerGallon) {
        this.model = model;
        if (fuelCapacity > 0.0) {
            this.fuelCapacity = fuelCapacity;
        }
        if (milesPerGallon > 0.0) {
            this.milesPerGallon = milesPerGallon;
        }   
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getFuelCapacity() {
        return this.fuelCapacity;
    }
    public void setFuelCapacity(double fuelCapacity) {
        if(fuelCapacity > 0.0) { 
            this.fuelCapacity = fuelCapacity;
        }
    }
    public double getMilesPerGallon() {
        return this.milesPerGallon;
    }
    public void setMilesPerGallon (double milesPerGallon) {
        if(milesPerGallon> 0.0) { 
            this.milesPerGallon = milesPerGallon;
        }
    }
    public double getTotalRange(){
        double totalRange = fuelCapacity * milesPerGallon;
       return totalRange;
    }
}