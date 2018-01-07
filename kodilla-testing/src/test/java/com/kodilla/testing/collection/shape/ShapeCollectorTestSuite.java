package com.kodilla.testing.collection.shape;


import com.kodilla.testing.shapeCollector.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given

        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circleTest = new Circle("kolo", 7);
        Triangle triangleTest = new Triangle("trojkat", 8);
        Square squareTest = new Square("kwadrad",3);

        //When
        shapeCollector.addFigure(circleTest);
        shapeCollector.addFigure(triangleTest);
        shapeCollector.addFigure(squareTest);

        //Then
        Assert.assertEquals("kolo", ((Circle)shapeCollector.getFigure(0)).getShapeName());
    }


}
