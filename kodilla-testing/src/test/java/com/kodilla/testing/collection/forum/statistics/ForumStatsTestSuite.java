package com.kodilla.testing.collection.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStats;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics mockStats = mock(Statistics.class);
        ForumStats forumStats = new ForumStats(mockStats);

        when(mockStats.commentsCount()).thenReturn(30);
        List<String> userList = new ArrayList<>();
//        userList.add("Jan Kowalski");
//        userList.add("Anna Kowalska");
//        userList.add("Piotr Kowalski");
        when(mockStats.usersNames()).thenReturn(userList);

        when(mockStats.postsCount()).thenReturn(1000);


        //When
        forumStats.calculateAdvStatistics();

        //Given
        Assert.assertEquals(30, forumStats.getCommentsCount());
        Assert.assertEquals(0, forumStats.getPostsCount());
        Assert.assertEquals(3, forumStats.getUsersCount());
        Assert.assertEquals(0, forumStats.getCommentsPerPost(), 0);
        Assert.assertEquals(10, forumStats.getCommentsPerUser(),0);
        Assert.assertEquals(0, forumStats.getPostsPerUser(),0);
        Assert.assertEquals(1000,forumStats.getPostsCount());
        Assert.assertEquals(0,forumStats.getUsersCount());

    }
}
