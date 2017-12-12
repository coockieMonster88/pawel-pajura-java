package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        List <Integer> list = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        List <Integer> result = ext.exterminate( list);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(12);
        list.add(15);
        OddNumbersExterminator ext2 = new OddNumbersExterminator();
        //When
        List result2 = ext2.exterminate(list);
        //Then
        Assert.assertEquals(3,result2.size());
    }
}
