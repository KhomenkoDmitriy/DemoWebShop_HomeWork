package com.demowebshop.khomenko.core;

import com.demowebshop.core.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startTest(Method method){
        logger.info("Start test {}", method.getName());
    }

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod(enabled = true)
    public void stopTest(ITestResult result){
        if (result.isSuccess()){
            logger.info("PASSED: {}", result.getMethod().getMethodName());

        }else {
            logger.error("FAILED: {} ", result.getMethod().getMethodName());

        }
        logger.info("Stop Test");

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
