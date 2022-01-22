
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class RegisterTest {
    public WebDriver driver;


    @Test
    public void register() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        //Entering First Name
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Daniela");
        //Entering Last Name
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Maciucian");
        //Enter Adress
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Oasului bLoc K1");
        //Enter Email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("danieladrm17@yahoo.com");
        //Enter Phone
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0747333624");
        //Select Gender
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        //Select Hobbies
        driver.findElement(By.id("checkbox1")).click();

        //Select Skills
        Select skills=new Select(driver.findElement (By.id("Skills")));
        skills.selectByVisibleText("SQL");


        //Select Languages
        WebElement languageElement = driver.findElement(By.id("msdd"));
        languageElement.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        List<WebElement> languageOptions= driver.findElements(By.cssSelector(".ui-autocomplete.ui-front>li>a"));
        for (int index=0;index< languageOptions.size();index++){
            if (languageOptions.get(index).getText().equals("English")
                || languageOptions.get(index).getText().equals("Arabic"))
            {
                languageOptions.get(index).click();
            }
        }

        driver.findElement(By.xpath("//input[@type='tel']")).click();
        //Select Country
        WebElement countryElement=driver.findElement(By.cssSelector("span[role='combobox']"));
        countryElement.click();
        WebElement countryInputElement= driver.findElement(By.className("select2-search__field"));
        countryInputElement.sendKeys("Australia");
        countryInputElement.sendKeys(Keys.ENTER);


        //Select Year
        Select year=new Select (driver.findElement (By. id ("yearbox")));
        year.selectByVisibleText("2013");
        //Select Month
        Select month=new Select(driver.findElement (By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("May");
        //Select day
        Select day=new Select(driver.findElement (By.id( "daybox")));
        day.selectByVisibleText("15");
        //Enter Password
        driver.findElement(By.id("firstpassword")).sendKeys("123456");
        //Enter confirm password
        driver.findElement(By.id("secondpassword")).sendKeys("123456");
        //enter Submit Button
        driver.findElement(By.id("submitbtn")).submit();

        WebElement uploadFileElement=driver.findElement(By.cssSelector("div>input[id=\"imagesrc\"]"));
        uploadFileElement.sendKeys("C:\\Users\\lotys\\OneDrive\\Desktop\\Azimut\\Logo psd1111111111111111.png");

    }
}

