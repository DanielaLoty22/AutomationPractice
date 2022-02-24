import base.Hooks;
import pages.IndexPage;
import pages.RegisterPage;
import org.junit.Test;


public class RegisterTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;

    @Test
    public void register(){

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());

        indexPage.clickSkipSignIn();

        registerPage.registerValidProcess(inputData);
    }
}