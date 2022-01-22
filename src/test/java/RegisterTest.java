
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



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
        //Select Language
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver. findElement(By.xpath("//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'English')]")).click();
        //Select Skills
        Select skills=new Select(driver.findElement (By.id("Skills")));
        skills.selectByVisibleText("SQL");
        //Select Country
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[7]")).click();
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





        }








    }

