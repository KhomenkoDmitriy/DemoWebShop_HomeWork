package com.demowebshop.khomenko.tests;

import com.demowebshop.khomenko.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @Test
    public void isHomeComponentPresentTest(){
       Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
    }
}