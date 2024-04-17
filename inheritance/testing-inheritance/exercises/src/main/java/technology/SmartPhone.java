package technology;

public class SmartPhone extends Computer {
    private String phoneNumber;
    public SmartPhone (double cpuClock, int ramSize, int diskSpace, String phoneNumber){
        super(cpuClock, ramSize, diskSpace);
        this.phoneNumber = phoneNumber;
    }

    public String makeCall(String phoneNumber){
        return ("Calling " + phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
