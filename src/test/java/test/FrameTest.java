package test;

import base.Hooks;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import org.junit.Test;

public class FrameTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;
    public FramePage framePage;




    @Test
    public void framesTest(){
        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        framePage=  new FramePage(getDriver());

        indexPage.clickSkipSignIn();
       // registerPage.goToFramePage();

        framePage.gotosingleframe();
        framePage.fillinputTextElement();
        framePage.switchtoURL();
        framePage.switchtomultipleElement();
        framePage.switchtoSingleElement();
        framePage.fillinputText2Element();
        framePage.clickMultipleFrame();




    }
}
