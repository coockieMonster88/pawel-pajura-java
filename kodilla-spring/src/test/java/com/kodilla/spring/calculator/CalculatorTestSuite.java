package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);


        //When
        double resultAdd = calculator.add(4,2);
        double resultDiv = calculator.div(4,2);
        double resultMul = calculator.mul(4,2);
        double resultSub = calculator.sub(4,2);

        //Then
        Assert.assertEquals(resultAdd,6,1);
        Assert.assertEquals(resultDiv, 2,1);
        Assert.assertEquals(resultMul, 8,1);
        Assert.assertEquals(resultSub,2,1);
    }
}
