package base;

import propertiesUtility.PropertiesObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShareData {


    private WebDriver driver;

    public void InitializeDriver(){
        PropertiesObject driverResource = new PropertiesObject("target/test-classes/driverResource/DriverResource.properties");
        System.setProperty(driverResource.getValueByKey("browser"), driverResource.getValueByKey("browserPath"));
        driver = new ChromeDriver();
        driver.get(driverResource.getValueByKey("url"));
        driver.manage().window().maximize();

        // Wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void TearDown(){

        // driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

}