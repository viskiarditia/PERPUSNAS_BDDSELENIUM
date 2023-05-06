package step_definitions.ProfileStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.Profil.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class VisiMisiPage {

    private WebDriver webDriver;
    public VisiMisiPage() throws InterruptedException{
        super();
        this.webDriver = Hooks.webDriver;

    }
    @Given("^User open the website perpusnas home page$")
    public void userOpenTheWebsitePerpusnasHomePage() throws InterruptedException {
       ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyHomePage());
        Thread.sleep(2000);

    }
    @When("^User hover on the navbar profile$")
    public void userHoverOnTheNavbarProfile() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setProfil();
        Thread.sleep(3000);
    }

    @And("^User hover on the navbar kelembagaan$")
    public void userHoverOnTheNavbarKelembagaan() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setKelembagaan();
        Thread.sleep(3000);
    }

    @And("^User click submenu visi-misi$")
    public void userClickSubmenuVisiMisi() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setVisiMisi();
        Thread.sleep(3000);
    }

    @Then("^User already on page visi-misi$")
    public void userAlreadyOnPageVisiMisi() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.setPageVisiMisi());
        Thread.sleep(2000);

    }
}
