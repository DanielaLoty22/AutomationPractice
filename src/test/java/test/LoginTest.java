package test;
import base.Hooks;
import pages.IndexPage;
import pages.LoginPage;
import org.junit.Test;



public class LoginTest extends Hooks {

    public IndexPage indexPage;
    public LoginPage loginPage;


    @Test
    public void login() {


        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        indexPage.clickSignIn();
        loginPage.loginInvalidProcess(inputData);


    }
}

        //Putem adauga un mesaj  =("textul cautat nu este corect")
        //Quit=inchidem instanta cu toate taburile deschise
        //Close=inchide tabul curent
        //driver.quit();













