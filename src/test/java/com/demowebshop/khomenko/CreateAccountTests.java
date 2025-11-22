package com.demowebshop.khomenko;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000 % 3600));
        clickOnRegisterLink();
        fillRegisterForm(new User()
                .setFirstName("Dmitriy")
                .setLastName("Medvedev")
                .setEmail("mitycan38" + i + "@gmail.com")
                .setPassword("Pp1234567!")
                .setConfirmPassword("Pp1234567!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isContinueButtonPresent());
    }
}
