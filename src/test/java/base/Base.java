package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        if (browserName.equals("chrome"))
            desiredCapabilities.setBrowserName("chrome");
        else if (browserName.equals("edge"))
            desiredCapabilities.setBrowserName("MicrosoftEdge");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), desiredCapabilities);
        return driver;

    }
}
