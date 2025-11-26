package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
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
