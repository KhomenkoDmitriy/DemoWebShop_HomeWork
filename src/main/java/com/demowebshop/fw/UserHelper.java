package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void fillRegisterForm(User user) {
        type(By.xpath("//input[@id='FirstName']"), user.getFirstName());

        type(By.xpath("//input[@id='LastName']"), user.getLastName());

        type(By.xpath("//input[@id='Email']"), user.getEmail());

        type(By.xpath("//input[@id='Password']"), user.getPassword());

        type(By.xpath("//input[@id='ConfirmPassword']"), user.getConfirmPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector(".ico-login"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input[value='Log in']"));
    }

    public boolean isContinueButtonPresent() {
        return isElementPresent(By.xpath("//input[@value='Continue']"));
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.cssSelector(".ico-logout"));
    }
}
