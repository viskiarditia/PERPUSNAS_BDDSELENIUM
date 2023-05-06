package step_definitions;

import cucumber.api.java.en.Then;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private WebDriver webDriver;
    public HomeSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on Home page")
    public void verifyHome(){
//        LoginPage loginPage = new LoginPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.verifyHome());
    }
}
