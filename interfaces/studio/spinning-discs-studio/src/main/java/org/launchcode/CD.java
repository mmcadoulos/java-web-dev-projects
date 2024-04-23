package org.launchcode;

public class CD extends BaseDisc implements OpticalDisk {
    public CD(String name, String discType, int totalCapacity, int storedCapacity) {
        super(name, discType, totalCapacity, storedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println(getContents());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
