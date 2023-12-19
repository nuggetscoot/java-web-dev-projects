package org.launchcode;

import org.junit.jupiter.api.Test;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsCase1ReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void balancedBracketsCase2ReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsCase3ReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsCase4ReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unbalancedBracketsCase1ReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void unbalancedBracketsCase2ReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void unbalancedBracketsCase3ReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalancedBracketsCase4ReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsWithQuotationMarksReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\"\"]"));
    }

    @Test
    public void bracketsWithQuotationMarksAndWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\"Launchcode\"]"));
    }

    @Test
    public void unbalancedBracketsWithQuotationMarksReturnsFalse () {
     assertFalse(BalancedBrackets.hasBalancedBrackets("[\"Launchcode\"["));
    }
}

