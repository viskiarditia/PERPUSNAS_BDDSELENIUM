package step_definitions.ProfileStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.Profil.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class FalsafahlogoPage {
    private WebDriver webDriver;

    public FalsafahlogoPage() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @And("^User click submenu falsafah logo$")
    public void userClickSubmenuFalsafahLogo() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setFalsafahLogo();
        Thread.sleep(3000);
    }

    @Then("^User already on page falsafah logo$")
    public void userAlreadyOnPageFalsafahLogo() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.setPageFalsafahLogo());
        Thread.sleep(2000);

    }

}
