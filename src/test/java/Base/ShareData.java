package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareData {


    public WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //Deschidem o instanta de chrome
        driver = new ChromeDriver();
        //Accesam un url
        driver.get("http://demo.automationtesting.in/Index.html");
        //Facem driverul in modul maximize
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
    driver.quit();

    }


}
