package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }


    // True Tests
    @Test
    void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    void stringEnclosedInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    void stringBeginsWithOpenAndClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    void stringIncludesWordEnclosedInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // False Tests

    @Test
    void checkOneOpenedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    void checkCloseAndOpenBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    void checkContainsOneOpenBracketOnly () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    void checkContainsOnlyReversedBrackets (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    void checkMoreThanOneOpen () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    void checkClosedClosedOpen (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]["));
    }

}