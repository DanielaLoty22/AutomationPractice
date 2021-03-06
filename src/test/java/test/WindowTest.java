package test;

import base.Hooks;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;
import org.junit.Test;



public class WindowTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;
    public WindowPage windowPage;

    @Test
    public void windowTest(){

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        windowPage = new WindowPage(getDriver());

        indexPage.clickSkipSignIn();

        registerPage.goToWindowPage();

        windowPage.newTabProcess();
        windowPage.newWindowProcess();
        windowPage.multipleTabsProcess();

    }

}

