public class SmartWashingMachine extends WashingMachine {

 private boolean wifiEnabled;
 private String  appVersion;
 public SmartWashingMachine(String brand, double powerRating, int warranty, int capacityKg, WashMode washMode,boolean wifiEnabled, String appVersion){
   super(brand, powerRating, warranty, capacityKg, washMode);
   wifiEnabled=true;
    this.wifiEnabled = wifiEnabled;
    this.appVersion = appVersion;
 }

 @Override
    public void displayInfo() {
      super.displayInfo();
        System.out.println("WiFi Enabled: " +wifiEnabled);
        System.out.println("App Version: " +appVersion);
    }

  public void connectWifi(){
        if (wifiEnabled){
            System.out.println("Connected to WiFi.");
        } else {
            System.out.println("WiFi not supported on this machine.");
        }
    }

    @Override
    public double calculateElectricityUsage(double hoursUsed){
        double Usage = super.calculateElectricityUsage(hoursUsed);
       
        return Usage;
    }

 public boolean isWifiEnabled() {
    return wifiEnabled;
 }
 public void setWifiEnabled(boolean wifiEnabled) {
    this.wifiEnabled = wifiEnabled;
 }
 public String getAppVersion() {
    return appVersion;
 }
 public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
 }    
}
