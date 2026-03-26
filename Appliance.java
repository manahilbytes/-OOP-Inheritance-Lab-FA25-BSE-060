public class Appliance{
    private String brand;
    private double powerRating;
    private int warranty;

    Appliance(String brand, double powerRating,int warranty){
        this.brand= brand;
        this.powerRating= powerRating;
        this.warranty= warranty;
    }
    public void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Power Rating: "+powerRating);
        System.out.println("Warranty: "+warranty+" Years");

    }

    public String toString(){
        return brand + " ("+powerRating + "Warranty: "+warranty+"months)";
    }

    public double calculateElectricityUsage(double hoursUsed){
        return (powerRating*hoursUsed)/1000.0;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPowerRating() {
        return powerRating;
    }
    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    
}