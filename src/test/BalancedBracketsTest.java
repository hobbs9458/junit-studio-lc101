package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test(expected = IllegalArgumentException.class)
    public void stringIsNullFalse() {
        BalancedBrackets.hasBalancedBrackets(null);
        fail("This should not have happened. The test should throw an error if null is passed to the function");
    }

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneClosingBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oneOpeningBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oddNumOfBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("more words][words go here]"));
    }

    @Test
    public void endBracketBeforeOpenBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeOpeningsTwoClosingsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void bracketsWithinBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Brackets Within Brackets]]"));
    }

    @Test
    public void opposingNestedBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]rackets Within Brackets]]"));
    }

    @Test
    public void threeOpeningBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
    }

    @Test
    public void threeClosingBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]"));
    }


    @Test
    public void twoOpposingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }




}
