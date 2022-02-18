import Base.ShareData;
import Help.ElementMethods;
import Help.FrameMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends ShareData {
    public FrameMethods frameMethods;
    public ElementMethods elementMethods;


    @Test
    public void framesTest(){

        frameMethods=new FrameMethods(driver);
        elementMethods= new ElementMethods(driver);

        WebElement skipsigninElement= driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipsigninElement);


        WebElement switchtoElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoElement).perform();

        WebElement framesElement = driver.findElement (By.xpath("//a[text()='Frames']"));
        elementMethods.clickElement(framesElement);

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");


        driver.switchTo().frame("singleframe");
        WebElement inputText= driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText.sendKeys("foame");

        frameMethods.switchToDefault();


        WebElement multipleframe = driver.findElement(By.cssSelector("a[href='#Multiple']"));
        elementMethods.clickElement(multipleframe);

        frameMethods.switchToFrameByElement(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.switchToFrameByElement(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement inputText2 = driver.findElement(By.cssSelector("div>input[type='text']"));
        elementMethods.fillElement(inputText2, "Test");


    }
}
