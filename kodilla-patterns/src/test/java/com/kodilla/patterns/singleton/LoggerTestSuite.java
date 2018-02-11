package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void getLastLog() { Logger.getInstance().log("Yours last log");}
    @Test
    public void testGetLastLog() {
        //Given

        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Log status: " + log);

        //Then
        Assert.assertEquals("Yours last log", log);

    }
}
