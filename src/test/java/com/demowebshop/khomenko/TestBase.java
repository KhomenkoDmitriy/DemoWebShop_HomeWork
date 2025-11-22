package com.demowebshop.khomenko;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public boolean isHomeComponentPresent() {
        return driver.findElements(By.xpath("//img[@class='nivo-main-image']")).size() > 0;

    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isContinueButtonPresent() {
        return isElementPresent(By.xpath("//input[@value='Continue']"));
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

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.cssSelector(".ico-logout"));
    }

    public void clickAddItems() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
        click(By.xpath("//span[normalize-space()='Shopping cart']"));
    }

    public boolean isItemPresent() {
        return isElementPresent(By.xpath("//a[@class='product-name']"));
    }

    public void fillLoginForm(User user) {
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        type(By.xpath("//input[@id='Password']"), user.getPassword());
    }
}
