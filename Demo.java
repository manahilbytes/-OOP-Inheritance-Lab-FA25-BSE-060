public class Demo{
    static void main(String[] args){
        Appliance a1 = new Appliance("LG", 2000, 10);
        WashingMachine w1 = new WashingMachine("Hier", 1800, 12, 7, WashingMachine.WashMode.Strong);
        SmartWashingMachine s1= new SmartWashingMachine("Dell", 1500, 36, 8, WashingMachine.WashMode.Medium, true, "v2.3");

   a1.displayInfo();
  
   w1.displayInfo();
   
    s1.displayInfo();

   w1.start();
                       //check methods
    w1.stop();
       
    s1.start();
     s1.connectWifi();


    }
    
}
