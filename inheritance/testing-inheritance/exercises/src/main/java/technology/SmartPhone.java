package technology;

public class SmartPhone extends Computer {
    private int phoneNumber;
    public SmartPhone (double cpuClock, int ramSize, int diskSpace, int phoneNumber){
        super(cpuClock, ramSize, diskSpace);
        this.phoneNumber = phoneNumber;
    }

    public void makeCall(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
