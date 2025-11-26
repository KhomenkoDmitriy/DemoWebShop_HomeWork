package com.demowebshop.khomenko.tests;

import com.demowebshop.data.UserData;
import com.demowebshop.khomenko.core.TestBase;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(UserData.FirstName)
                .setLastName(UserData.LastName)
                .setEmail(String.format(UserData.generateEmail()))
                .setPassword(UserData.password)
                .setConfirmPassword(UserData.ConfirmPassword));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isContinueButtonPresent());
    }
}
