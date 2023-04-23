package demoTests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class TestTwo extends Base {
    WebDriver driver;
    @Test
    public void test2(){
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle() + " from edge node");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = initializeBrowser("edge");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
