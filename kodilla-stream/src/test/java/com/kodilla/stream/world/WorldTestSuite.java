package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("30000000"));
        Country germany = new Country("Germany", new BigDecimal("49000000"));
        Continent europe = new Continent("Europe");
        europe.getCountries().add(poland);
        europe.getCountries().add(germany);
        World world = new World();
        world.getContinents().add(europe);
        Country china = new Country("China", new BigDecimal("1379000000"));
        Country russia = new Country("Russia", new BigDecimal("144300000"));
        Continent asia = new Continent("Asia");
        asia.getCountries().add(china);
        asia.getCountries().add(russia);
        world.getContinents().add(asia);
        Country canada = new Country("Canada",new BigDecimal("36290000"));
        Country usa = new Country("USA", new BigDecimal("323100000"));
        Continent northAmerica = new Continent("North America");
        northAmerica.getCountries().add(canada);
        northAmerica.getCountries().add(usa);
        world.getContinents().add(northAmerica);
        Country brazil = new Country("Brazil", new BigDecimal("207700000"));
        Country argentina = new Country("Argentina", new BigDecimal("43850000"));
        Continent southAmerica = new Continent("South America");
        southAmerica.getCountries().add(brazil);
        southAmerica.getCountries().add(argentina);
        world.getContinents().add(southAmerica);
        Country egypt = new Country("Egypt", new BigDecimal("95690000"));
        Country rpa = new Country("RPA", new BigDecimal("55910000"));
        Continent africa = new Continent("Africa");
        africa.getCountries().add(egypt);
        africa.getCountries().add(rpa);
        world.getContinents().add(africa);



        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("2364840000"), result);

    }
}
