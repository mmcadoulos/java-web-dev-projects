package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TechTest {
    // test abstracter
    @BeforeEach
    void createComps() {
        pc = new Computer(3, 3, 3);
        laptop = new Laptop(3, 3, 3, 90);
        phone = new SmartPhone(3, 3, 3, "222-2222");
    }

        @Test
    void compareId() {
    assertNotEquals(phone.getId(), pc.getId());

    }




    // Laptop Tests
    Laptop laptop;

    @BeforeEach
    void createLaptop() {
        laptop = new Laptop(2.7, 32, 512, 50);
    }
//    @Test
//    void testGetBatteryCharge () {
//        assertEquals(50, laptop.getBatteryCharge(), .001);
//    }

    @Test
    void testChargeBattery() {
        laptop.chargeBattery(2);
        assertEquals(53, laptop.getBatteryCharge(), .001);
    }

    @Test
    void testChargeBatteryOvercharge() {
        laptop.chargeBattery(200000);
        assertEquals(100, laptop.getBatteryCharge(), .001);
    }

    //    SmartPhone Tests
    SmartPhone phone;

    @BeforeEach
    void createPhone() {
        phone = new SmartPhone(2, 4, 64, "314-111-2222");
    }

    @Test
    void testCall() {
        assertEquals("Calling 3143334444", phone.makeCall("3143334444"));
    }


    //    Computer Tests
    Computer pc;

    @BeforeEach
    void createComputer() {
        pc = new Computer(3.4, 8, 512);
    }

    @Test
    void testPowerButtonOn() {
        assertTrue(pc.powerButton());
    }

    @Test
    void testPowerButtonOff() {
        pc.powerButton();
        assertFalse(pc.powerButton());
    }

    @Test
    void testRunProgram() {
        pc.runProgram("IntelliJ");
        assertTrue(pc.getRunningProgram());
    }



}
