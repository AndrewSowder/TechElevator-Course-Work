package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    CigarParty testCode = new CigarParty();

    @Test
    public void cigar_party_success_during_the_week_with_right_amount_of_cigars(){
        Assert.assertEquals("Too few, or too many Cigars", true, testCode.haveParty(40, false));
        Assert.assertEquals("Too few, or too many Cigars", true, testCode.haveParty(60, false));
    }
    @Test
    public void cigar_party_failure_during_the_week_with_wrong_amount_of_cigars(){
        Assert.assertEquals("Number of cigars is in range to be a success", false, testCode.haveParty( 39, false));
        Assert.assertEquals("Number of cigars is in range to be a success", false, testCode.haveParty( 61, false));
    }
    @Test
    public void cigar_party_success_during_the_weekend_with_right_amount_of_cigars(){
        Assert.assertEquals("Not enough Cigars to be a success", true, testCode.haveParty(40, true));
        Assert.assertEquals("Not enough Cigars to be a success", true, testCode.haveParty(80, true));
    }
    @Test
    public void cigar_party_failure_during_the_weekend_with_wrong_amount_of_cigars(){
        Assert.assertEquals("Number of cigars is in of range to be a success", false, testCode.haveParty( 39, true));
        Assert.assertEquals("Number of cigars is in of range to be a success", false, testCode.haveParty( 5, false));
    }


}
