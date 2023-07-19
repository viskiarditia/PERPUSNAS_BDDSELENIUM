package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BerandaSteps {
    private WebDriver webDriver;
    public BerandaSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^User open website perpusnas$")
    public void userOpenWebsitePerpusnas() throws InterruptedException {
        WebElement goToPage = webDriver.findElement(By.cssSelector(".navbar-brand"));
        goToPage.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^click Menu Beranda$")
    public void clickMenuBeranda() throws InterruptedException {
        WebElement MenuBeranda = webDriver.findElement((By.xpath("//li[.='Beranda']")));
        MenuBeranda.click();
        Thread.sleep(500);
    }
}
