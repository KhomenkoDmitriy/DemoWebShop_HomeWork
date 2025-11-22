package com.demowebshop.khomenko;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnLoginLink();
        fillLoginForm(new User()
                .setEmail("mitycan38@gmail.com")
                .setPassword("Pp1234567!"));
        clickOnLoginButton();
        Assert.assertTrue(isLogOutButtonPresent());
    }

    @Test
    public void addItemToCartTest() {
        clickAddItems();
        Assert.assertTrue(isItemPresent());
    }

}
