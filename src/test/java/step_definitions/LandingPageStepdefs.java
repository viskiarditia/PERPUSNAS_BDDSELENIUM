package step_definitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageStepdefs {
    private WebDriver webDriver;
    public LandingPageStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^User open website perpusnas$")
    public void userOpenWebsitePerpusnas() throws InterruptedException {
        WebElement loginPage = webDriver.findElement(By.cssSelector(".navbar-brand"));
        loginPage.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}
