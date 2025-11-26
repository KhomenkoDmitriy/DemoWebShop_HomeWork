package com.demowebshop.khomenko.tests;


import com.demowebshop.data.UserData;
import com.demowebshop.khomenko.core.TestBase;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLoginLink();
        app.getItems().fillLoginForm(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());
    }

    @Test
    public void addItemToCartTest() {
        app.getItems().clickAddItems();
        Assert.assertTrue(app.getItems().isItemPresent());
    }

}
