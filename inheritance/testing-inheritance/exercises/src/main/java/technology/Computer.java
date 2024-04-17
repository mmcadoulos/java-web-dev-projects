package technology;

public /*abstract*/ class Computer extends AbstractEntity {
    private double cpuClock;
    private int ramSize;
    private int diskSpace;
    private Boolean isOn = false;
    private Boolean isRunningProgram = false;

    public Computer(double cpuClock, int ramSize, int diskSpace) {
        this.cpuClock = cpuClock;
        this.ramSize = ramSize;
        this.diskSpace = diskSpace;
    }

    public Boolean powerButton() {
        if (isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
        }
        return this.isOn;
    }

    public void runProgram(String programName) {
        this.isRunningProgram = true;
        System.out.println("Running " + programName);
        // could create a programs running arraylist and methods to close them?
    }


    // Getters and Setters
    public double getCpuClock() {
        return cpuClock;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Boolean getOn() {
        return isOn;
    }

    public Boolean getRunningProgram() {
        return isRunningProgram;
    }
}
