import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class WindowTesst extends ShareData {

    @Test
    public void windowtest(){

        WebElement skipsigninElement= driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement switchtoElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoElement).perform();

        WebElement windowsElement = driver.findElement (By.xpath("//a[text()='Windows']"));
        windowsElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowOptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowOptions.get(0).click();
        WebElement newtabok = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newtabok.click();
        System.out.println("Titlul paginii: "+ driver.getTitle());
        List<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Titlul paginii 2: "+ driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii: "+ driver.getTitle());

        windowOptions.get(1).click();
        WebElement newwindow = driver.findElement(By.cssSelector("#Seperate>button"));
        newwindow.click();
        System.out.println("Titlul paginii: "+ driver.getTitle());
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        System.out.println("Titlul paginii 2: "+ driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii: "+ driver.getTitle());




        windowOptions.get(1).click();
        WebElement newwindowandTab= driver.findElement(By.cssSelector("#Multiple>button"));
        newwindowandTab.click();

        System.out.println("Titlul paginii: "+ driver.getTitle());
        List<String> multipletabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipletabs .get(2));
        System.out.println("Titlul paginii 2: "+ driver.getTitle());

        driver.close();
        driver.switchTo().window(multipletabs .get(1));
        System.out.println("Titlul paginii: "+ driver.getTitle());







    }


}
