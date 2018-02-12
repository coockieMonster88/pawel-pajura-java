package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User paul = new Millenials("Paul");
        User ann = new YGeneration("Ann");
        User andrew = new ZGeneration("Andrew");

        //When
        String paulPublishing = paul.sharePost();
        System.out.println("Paul shares his moments... " + paulPublishing);
        String annPublishing = ann.sharePost();
        System.out.println("Ann shares her moments... " + annPublishing);
        String andrewPublishing = andrew.sharePost();
        System.out.println("Andrew shares his moments... " + andrewPublishing);

        //Then
        Assert.assertEquals("Using Facebook to share",paulPublishing);
        Assert.assertEquals("Using Twitter to share",annPublishing);
        Assert.assertEquals("Using SnapChat to share",andrewPublishing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User paul = new Millenials("Paul");

        //When
        String paulPublishing = paul.sharePost();
        System.out.println("Paul shares his moments... " + paulPublishing);
        paul.setSocialPortal(new TwitterPublisher());
        paulPublishing = paul.sharePost();
        System.out.println("Paul again shares his moments... " + paulPublishing);

        //Then
        Assert.assertEquals("Using Twitter to share",paulPublishing);
    }
}
