import Base.ShareData;
import Help.ElementMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RegisterTest extends ShareData {
    public ElementMethods elementMethods;


    @Test
    public void register() {


        elementMethods = new ElementMethods(driver);

        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipSignInElement);

        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        elementMethods.clickElement(firstNameElement);
        String firstNameValue = "Daniela";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        elementMethods.clickElement(lastNameElement);
        String lastNameValue = "Maciucian";
        lastNameElement.sendKeys(lastNameValue);

        WebElement addressElement = driver.findElement(By.cssSelector("textarea[rows='3']"));
        elementMethods.clickElement(addressElement);
        String addressValue = "Strada Oasului, nr. 86/90,  ap. 3, jud. Cluj, Romania";
        addressElement.sendKeys(addressValue);

        WebElement emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        elementMethods.clickElement(emailElement);
        String emailValue = "danieladrm17@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement phoneNumberElement = driver.findElement(By.cssSelector("input[type='tel']"));
        elementMethods.clickElement(phoneNumberElement);
        String phoneNumberValue = "0751592751";
        phoneNumberElement.sendKeys(phoneNumberValue);

        WebElement genderElement = driver.findElement(By.cssSelector("input[value='FeMale']"));
        elementMethods.clickElement(genderElement);


        WebElement hobbiesElement =  driver.findElement(By.cssSelector("input[value='Movies']"));
        elementMethods.clickElement(hobbiesElement);

        //Select Skills
        WebElement skills=driver.findElement (By.id("Skills"));
        elementMethods.selectElementByText(skills,"SQL");


        //Select Languages
        WebElement languageElement = driver.findElement(By.id("msdd"));
        elementMethods.clickElement(languageElement);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        List<WebElement> languageOptions= driver.findElements(By.cssSelector(".ui-autocomplete.ui-front>li>a"));
        for (WebElement languageOption : languageOptions) {
            if (languageOption.getText().equals("English")
                    || languageOption.getText().equals("Arabic")) {
                languageOption.click();
            }
        }
        driver.findElement(By.xpath("//input[@type='tel']")).click();

        //Select Country
        WebElement countryElement=driver.findElement(By.cssSelector("span[role='combobox']"));
        elementMethods.clickElement(countryElement);
        WebElement countryInputElement= driver.findElement(By.className("select2-search__field"));
        countryInputElement.sendKeys("Australia");
        countryInputElement.sendKeys(Keys.ENTER);


        //Select Year
        WebElement yearElement =driver.findElement (By. id ("yearbox"));
        elementMethods.selectElementByValue(yearElement,"2013");

        //Select Month
        WebElement monthElement =driver.findElement (By.xpath("//select[@placeholder='Month']"));
        elementMethods.selectElementByText(  monthElement, "May");

        //Select day
        WebElement dayElement =driver.findElement (By.id( "daybox"));
        elementMethods.selectElementByValue(dayElement,"15");

        //Enter Password
        WebElement passwordElement = driver.findElement(By.id("firstpassword"));
        elementMethods.clickElement(passwordElement);
        String passwordvalue= "Hachiko";
        passwordElement.sendKeys(passwordvalue);

        //Enter confirm password
        WebElement confirmpasswordElement = driver.findElement(By.id("secondpassword"));
        elementMethods.clickElement(confirmpasswordElement);
        String confirmPasswordValue="Hachiko";
        confirmpasswordElement.sendKeys(confirmPasswordValue);


        //enter Submit Button
        WebElement submitElement= driver.findElement(By.id("submitbtn"));
        elementMethods.clickElement(submitElement);


        WebElement uploadFileElement=driver.findElement(By.cssSelector("div>input[id='imagesrc']"));
        uploadFileElement.sendKeys("C:\\Users\\lotys\\OneDrive\\Desktop\\Azimut\\Logo psd1111111111111111.png");

    }
}

