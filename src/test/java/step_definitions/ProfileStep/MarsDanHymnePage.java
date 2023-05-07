package step_definitions.ProfileStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.Profil.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MarsDanHymnePage {
    private WebDriver webDriver;

    public MarsDanHymnePage() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^User click submenu mars dan hymne$")
    public void userClickSubmenuMarsDanHymne() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setMarsDanHymne();
        Thread.sleep(3000);
    }
    @Then("^User already on page mars dan hymne$")
    public void userAlreadyOnPageMarsDanHymne() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.setPagemarsAndHymne());
        Thread.sleep(2000);
    }
}
