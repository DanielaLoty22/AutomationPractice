package test;

import base.Hooks;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import org.junit.Test;


public class AlertTest extends Hooks{


    public IndexPage indexPage;
    public RegisterPage registerPage;
    public AlertPage alertPage;

    @Test
    public void TestAutomat(){

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        alertPage = new AlertPage(getDriver());

        indexPage.clickSkipSignIn();

        registerPage.goToAlertPage();

        alertPage.alertOkProcess();
        alertPage.alertOkCancelProcess();
        alertPage.alertTextProcess(inputData);
    }
}







