package step_definitions.ProfileStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.Profil.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class FotoGedungPage {
    private WebDriver webDriver;

    public FotoGedungPage() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @And("^User click submenu foto gedung$")
    public void userClickSubmenuFotoGedung() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setFotoGedung();
        Thread.sleep(3000);
    }

    @Then("^User already on page foto gedung$")
    public void userAlreadyOnPageFotoGedung() throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.setPageFotoGedung());
        Thread.sleep(2000);
    }
}
