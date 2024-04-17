package technology;

public class Laptop extends Computer{
    private double batteryCharge;
    private double chargePerMinute = 1.5;

    public Laptop (double cpuClock, int ramSize, int diskSpace, double batteryCharge){
        super(cpuClock, ramSize, diskSpace);
        this.batteryCharge = batteryCharge;
    }

    public void chargeBattery(int minutes){
        if ((batteryCharge + (chargePerMinute*minutes)) > 100){
            batteryCharge = 100;
        } else {
            batteryCharge += chargePerMinute*minutes;
        }
    }

    // Getter
    public double getBatteryCharge() {
        return batteryCharge;
    }
}
