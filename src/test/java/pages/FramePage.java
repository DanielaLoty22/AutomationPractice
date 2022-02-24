package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FramePage extends BasePage{
    public FramePage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement framesElement;
    @FindBy(css = "div>input[type='text']")
    private WebElement inputTextElement;
    @FindBy(css="a[href='#Multiple']")
    private WebElement multipleframeElement;
    @FindBy(css = "iframe[src='MultipleFrames.html']")
    private WebElement switchToFrameByElement;
    @FindBy(css="iframe[src='SingleFrame.html']")
    private WebElement switchToFrame1ByElement;
    @FindBy(css= "div>input[type='text']")
    private WebElement getInputText2Element;


    public void gotosingleframe(){

        frameMethods.switchToFrameByElement(framesElement);
    }

    public void fillinputTextElement(){
        elementMethods.fillElement(inputTextElement, "Salut");}

    public void switchtoURL(){
        pageMethods.NavigateToURL("http://demo.automationtesting.in/Frames.html");}


    public void switchtomultipleElement(){
        frameMethods.switchToFrameByElement(multipleframeElement);}

    public void switchtoSingleElement(){
        frameMethods.switchToFrameById(switchToFrame1ByElement);
    }

    public void fillinputText2Element(){
        elementMethods.fillElement(getInputText2Element,"Salut2");
    }

    public void clickMultipleFrame(){

        elementMethods.clickElement(multipleframeElement);
    }

    }











