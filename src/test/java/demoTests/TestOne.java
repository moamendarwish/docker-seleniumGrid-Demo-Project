package demoTests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;


public class TestOne extends Base {
    WebDriver driver;
    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle() + " from chrome node");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = initializeBrowser("chrome");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
