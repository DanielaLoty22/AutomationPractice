package Test;

import Base.ShareData;
import Help.ElementMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends ShareData {
    public ElementMethods elementMethods;

    //Declaram variabila webdriver cu selenium

    public WebDriver driver;


    @Test
    public void login() {
        elementMethods = new ElementMethods(driver);

        WebElement signinElement = driver.findElement(By.id("btn1"));
        elementMethods.clickElement(signinElement);

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue = "danieladrm17@yahoo.com";
        emailElement.sendKeys(emailvalue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[ng-model='Password']"));
        String passwordvalue = "Hachiko";
        passwordElement.sendKeys(passwordvalue);

        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        elementMethods.clickElement(enterElement);

        WebElement loginError = driver.findElement(By.cssSelector("label[id='errormsg']"));
        elementMethods.validateElementText(loginError, "Invalid User Name or PassWord");

        //Putem adauga un mesaj  =("textul cautat nu este corect")
        //Quit=inchidem instanta cu toate taburile deschise
        //Close=inchide tabul curent
        //driver.quit();
    }

        }










