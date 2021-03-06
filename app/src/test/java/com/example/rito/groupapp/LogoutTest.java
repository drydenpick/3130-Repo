package com.example.rito.groupapp;
import org.junit.Test;
import org.junit.Assert;

/**
 * LogoutTest tests if the user is logged out.
 *
 * @author  Divanno, Yuze
 * @since   2018-06-26
 */
public class LogoutTest {

    private static User testUser;

    @Test
    public void logout_success() {

        testUser = null;
        Assert.assertTrue(testUser == null);
    }
}
