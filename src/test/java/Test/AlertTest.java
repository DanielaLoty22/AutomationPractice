package Test;

import Base.ShareData;
import Help.AlertMethods;
import Help.ElementMethods;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertTest extends ShareData {


    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;

    @Test
    public void testautomat(){

        elementMethods= new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        alertMethods= new AlertMethods(driver);

        WebElement skipsigninElement= driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipsigninElement);

        WebElement switchtoElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethods.moveToElement(switchtoElement);

        WebElement alertsElement = driver.findElement (By.xpath("//a[text()='Alerts']"));
        elementMethods.clickElement(alertsElement);


        pageMethods.NavigateToURL("http://demo.automationtesting.in/Alerts.html");


        List<WebElement> alertOptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertOptions.get(0).click();
        WebElement alertOk = driver.findElement(By.cssSelector("#OKTab>button"));
        elementMethods.clickElement(alertOk);
        alertMethods.acceptAlert();



        alertOptions.get(1).click();
        WebElement alertOkCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOkCancel.click();
        elementMethods.clickElement(alertOkCancel);
        alertMethods.cancelAlert();

        alertOptions.get(2).click();
        WebElement alertTextbox = driver.findElement(By.cssSelector("#Textbox>button"));
        elementMethods.clickElement(alertTextbox);
        alertMethods.acceptFillAlert("Test");



    }
}
