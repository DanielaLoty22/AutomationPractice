package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    //Declaram variabila webdriver cu selenium

    public WebDriver driver;


    @Test
    public void login() {
        //Setam driverul de chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //Deschidem o instanta de chrome
        driver = new ChromeDriver();
        //Accesam un url
        driver.get("http://demo.automationtesting.in/Index.html");
        //Facem driverul in modul maximize
        driver.manage().window().maximize();

        WebElement signinElement = driver.findElement(By.id("btn1"));
        signinElement.click();

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue = "danieladrm17@yahoo.com";
        emailElement.sendKeys(emailvalue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[ng-model='Password']"));
        String passwordvalue = "Hachiko";
        passwordElement.sendKeys(passwordvalue);
        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        enterElement.click();

        WebElement passerrorElement = driver.findElement(By.id("errormsg"));
        String expectedmsg = "Invalid User Name or PassWord";
        String actualmsg = passerrorElement.getText();
        Assert.assertEquals(expectedmsg, actualmsg);
        //Putem adauga un mesaj  =("textul cautat nu este corect")
        //Quit=inchidem instanta cu toate taburile deschise
        //Close=inchide tabul curent
        driver.quit();
    }

        }










