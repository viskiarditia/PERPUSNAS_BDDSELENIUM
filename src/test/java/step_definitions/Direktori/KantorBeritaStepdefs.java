package step_definitions.Direktori;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

import java.util.List;

public class KantorBeritaStepdefs {
    private WebDriver webDriver;
    public KantorBeritaStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^click hover Koleksi Digital and go Direktori and click sub menu Kantor Berita$")
    public void clickHoverKoleksiDigitalAndGoDirektoriAndClickSubMenuKantorBerita() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        Thread.sleep(500);
        WebElement Direktori = webDriver.findElement(By.xpath("//a[.='Direktori']"));
        Direktori.click();
        Thread.sleep(500);
        WebElement ClickSubMenu = webDriver.findElement(By.cssSelector("[href='/direktori/kantor-berita']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @And("^Click and Check All div class Kantor Berita in page$")
    public void clickAndCheckAllDivClassKantorBeritaInPage() throws InterruptedException {
        String[] xpathArray = {
                "//div[contains(text(),'SUNA Sudan National News Agency')]",
                "//div[contains(text(),'AA (Anadolu Ajansi)')]",
                "//div[contains(text(),'AAP (Australian Associated Press)')]",
                "//div[contains(text(),'ABP (Agence Benoise de Press')]",
                "//div[contains(text(),'ABP (Agence Burundaise de Presse)')]",
                "//div[contains(text(),'ACAP (Agence Camerounaise de Presse)')]",
                "//div[contains(text(),'ACI (Agence Congolaise d`Information)')]",
                "//div[contains(text(),'Agence Togolaise de Presse BP ATOP')]",
                "//div[contains(text(),'AGERPRESS Agentia Romana de Pressa')]",
                "//div[contains(text(),'AGP (Agence Gabonaise de Presse)')]",
                "//div[contains(text(),'AIC (Agencia Informativa Centroamericana)')]",
                "//div[contains(text(),'AIP')]",
                "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]",
                "//div[contains(text(),'AMP (Agence Madagascar Presse)')]",
                "//div[contains(text(),'AN (Agencia Nacional)')]",
                "//div[contains(text(),'ANA (Aden News Agency)')]",
                "//div[contains(text(),'ANA (Athens News Agency)')]",
                "//div[18]//div[@id='accordion__heading-e']",
                "//div[contains(text(),'ANGOP (Agencia Angolana de Prensa)')]",
                "//div[contains(text(),'ANI (Agence Nationale`d Information)')]",
                "//div[contains(text(),'ANI (Agencia de Noticias E de Informacoes)')]",
                "//div[contains(text(),'ANP (Algemeen Nederlands Persbureu)')]",
                "//div[contains(text(),'ANP the Algemeen Nederlands Persbureau BV (ANP)')]",
                "//div[contains(text(),'ANZA (Agenzia Nazionale Stampa)')]"

        };

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Actions actions = new Actions(webDriver);

        for (String xpath : xpathArray) {
            WebElement element = webDriver.findElement(By.xpath(xpath));
            actions.moveToElement(element).click().perform();
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(500);
        }
        // Scroll back to the top
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        WebElement backDirektori = webDriver.findElement(By.xpath("//a[contains(text(),'direktori')]"));
        backDirektori.click();
        Thread.sleep(500);
    }
}
