public class WashingMachine extends Appliance{
   private  int capacityKg;
   enum WashMode{
    Strong, Medium, Mild;
   }
   private WashMode washMode;

   WashingMachine(String brand, double prowerRating,int warranty,int capacitKg, WashMode washMode){
    super(brand, prowerRating, warranty);
    this.capacityKg= capacitKg;
    this.washMode= washMode;
   }

 @Override
    public void displayInfo(){
       super.displayInfo();
        System.out.println("Capacity: " + capacityKg + " kg");
      System.out.println("Wash Mode: " + washMode);
    }

public void start(){
        System.out.println("Washing Machine started in " +washMode +" action.");
    }

   public void stop(){
        System.out.println("Washing Machine stopped.");
    }


    public int getCapacityKg() {
    return capacityKg;
}

   public void setCapacityKg(int capacityKg) {
    this.capacityKg = capacityKg;
   }

   public WashMode getWashMode() {
    return washMode;
   }

   public void setWashMode(WashMode washMode) {
    this.washMode = washMode;
   }
}




    

