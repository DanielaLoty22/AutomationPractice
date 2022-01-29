import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends ShareData {


    @Test
    public void framesTest(){

        WebElement skipsigninElement= driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement switchtoElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoElement).perform();

        WebElement framesElement = driver.findElement (By.xpath("//a[text()='Frames']"));
        framesElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");


        driver.switchTo().frame("singleframe");
        WebElement inputText= driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText.sendKeys("foame");

        driver.switchTo().defaultContent();


        WebElement multipleframe = driver.findElement(By.cssSelector("a[href='#Multiple']"));
        multipleframe.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement inputText2= driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText2.sendKeys("foame mare");


    }
}
