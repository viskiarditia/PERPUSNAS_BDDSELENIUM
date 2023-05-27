package step_definitions.Direktori;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class HariPentingStepdefs {
    private WebDriver webDriver;
    public HariPentingStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go Direktori and click sub menu Hari Penting$")
    public void clickHoverKoleksiDigitalAndGoDirektoriAndClickSubMenuHariPenting() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        Thread.sleep(1000);
        WebElement Direktori = webDriver.findElement(By.xpath("//a[.='Direktori']"));
        Direktori.click();
        Thread.sleep(1000);
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Hari Penting']"));
        ClickSubMenu.click();
        Thread.sleep(1000);
    }

    @Then("^Click and Check All div class Hari Penting in page$")
    public void clickAndCheckAllDivClassHariPentingInPage() throws InterruptedException {
        String[] xpathArray = {
                "//div[contains(text(),'Hari AIDS Sedunia')]",
                "//div[contains(text(),'Hari Air Sedunia')]",
                "//div[contains(text(),'Hari Aksara Internasional')]",
                "//div[contains(text(),'Hari Alzheimer Sedunia')]",
                "//div[contains(text(),'Hari Anak Internasional')]",
                "//div[contains(text(),'Hari Anak Jakarta Membaca')]",
                "//div[contains(text(),'Hari Anak Korban Perang')]",
                "//div[contains(text(),'Hari Anak Nasional')]",
                "//div[contains(text(),'Hari Anak-anak Sedunia')]",
                "//div[contains(text(),'Hari Angkutan Nasional')]",
                "//div[contains(text(),'Hari Anti Narkoba Internasional')]",
                "//div[contains(text(),'Hari Armada Republik Indonesia')]",
                "//div[contains(text(),'Hari Arsitektur Indonesia')]",
                "//div[contains(text(),'Hari Artileri')]",
                "//div[contains(text(),'Hari ASI Sedunia')]",
                "//div[contains(text(),'Hari Bahasa Eropa')]",
                "//div[contains(text(),'Hari Bahasa Ibu Internasional')]",
                "//div[contains(text(),'Hari Bakti Pos dan Telekomunikasi')]",
                "//div[contains(text(),'Hari Bakti PU')]",
                "//div[contains(text(),'Hari Bank Dunia')]",
                "//div[contains(text(),'Hari Bank Indonesia')]",
                "//div[contains(text(),'Hari Batik Nasional dan Hari Batik Dunia')]",
                "//div[contains(text(),'Hari Bebas Kendaraan Bermotor')]",
                "//div[contains(text(),'Hari Bela Negara')]"

        };

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Actions actions = new Actions(webDriver);

        for (String xpath : xpathArray) {
            WebElement element = webDriver.findElement(By.xpath(xpath));
            actions.moveToElement(element).click().perform();
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
        }
        // Scroll back to the top
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        WebElement backDirektori = webDriver.findElement(By.xpath("//a[contains(text(),'direktori')]"));
        backDirektori.click();
        Thread.sleep(500);
    }
}
