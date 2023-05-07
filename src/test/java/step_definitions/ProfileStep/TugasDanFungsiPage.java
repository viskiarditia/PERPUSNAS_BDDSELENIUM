package step_definitions.ProfileStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.Profil.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class TugasDanFungsiPage {
    private WebDriver webDriver;
    public TugasDanFungsiPage() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;
    }
        @And("^User click submenu tugas dan fungsi$")
        public void userClickSubmenuTugasDanFungsi() throws InterruptedException {
            ProfilPage profilPage = new ProfilPage(webDriver);
            profilPage.setPageTugasDanFungsi();
            Thread.sleep(3000);
    }
        @Then("^User already on page tugas dan fungsi$")
        public void userAlreadyOnPageTugasDanFungsi() throws InterruptedException {
            ProfilPage profilPage = new ProfilPage(webDriver);
            Assert.assertTrue(profilPage.setPageTugasDanFungsi());
            Thread.sleep(2000);



        }
}
