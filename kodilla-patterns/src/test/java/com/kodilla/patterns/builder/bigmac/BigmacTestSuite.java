package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigMacTestNew () {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("Cheese")
                .roll("Sezam")
                .sauce("BBQ")
                .burgers("Medium")
                .ingredients("Becon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, howManyIngredients);

    }
}
