package Pages;
import Help.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    public WebDriver driver;
    public FrameMethods elementMethods;
    private FrameMethods frameMethods;

    public void FrameMethods (WebDriver driver) {

        this.driver = driver;
        elementMethods = new FrameMethods(driver);
        frameMethods = new FrameMethods(driver);
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//a[text()='Frames']")
    public WebElement framesElement;
    @FindBy(css = "div>input[type='text']")
    public WebElement inputTextElement;
    @FindBy(css="a[href='#Multiple']")
    public WebElement multipleframeElement;
    @FindBy(css = "iframe[src='MultipleFrames.html']")
    public WebElement switchToFrameByElement;
    @FindBy(css="iframe[src='SingleFrame.html']")
    public WebElement switchToFrame1ByElement;
    @FindBy(css= "div>input[type='text']")
    public WebElement getInputText2Element;

    public void framesElement(){
        elementMethods.switchToFrameByElement(framesElement);
        elementMethods.switchToFrameByElement(multipleframeElement);
        frameMethods.switchToFrameByElement(inputTextElement);

    }
    public void singleFrame(){
        elementMethods.switchToFrameByElement(framesElement);
        elementMethods.switchToFrameByElement(switchToFrameByElement);
        elementMethods.switchToFrameByElement(switchToFrame1ByElement);
        frameMethods.switchToFrameByElement(getInputText2Element);



    }











}
