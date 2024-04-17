package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CatTest {
//@Test
//public void emptyTest(){
//    assertEquals(10, 10.001, .001);
//}

    @Test
    public void inheritsSuperInFirstConstructor() {
        org.launchcode.HouseCat keyboardCat = new org.launchcode.HouseCat("Keyboard org.launchcode.Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
   assertEquals(keyboardCat.getWeight(), 13, .001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
