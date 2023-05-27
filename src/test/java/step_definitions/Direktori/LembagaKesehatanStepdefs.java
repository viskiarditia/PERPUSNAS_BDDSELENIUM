package step_definitions.Direktori;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class LembagaKesehatanStepdefs {
    private WebDriver webDriver;
    public LembagaKesehatanStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go Direktori and click sub menu Lembaga Kesehatan$")
    public void clickHoverKoleksiDigitalAndGoDirektoriAndClickSubMenuLembagaKesehatan() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        Thread.sleep(1000);
        WebElement Direktori = webDriver.findElement(By.xpath("//a[.='Direktori']"));
        Direktori.click();
        Thread.sleep(1000);
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Lembaga Kesehatan']"));
        ClickSubMenu.click();
        Thread.sleep(1000);
    }


    @Then("^Click and Check All div class Lembaga Kesehatan in page$")
    public void clickAndCheckAllDivClassLembagaKesehatanInPage() throws InterruptedException {
        String[] xpathArray = {
                "//div[contains(text(),'Abadi Jaya, Klinik Spesialis')]",
                "//div[contains(text(),'Abadi, Klinik Apotek')]",
                "//div[contains(text(),'ABBA, Klinik Apotek')]",
                "//div[contains(text(),'Abdi Karya, Rumah Bersalin')]",
                "//div[contains(text(),'Abdi Medika, Klinik Spesialis')]",
                "//div[contains(text(),'Abdi Waluyo, Rumah Sakit')]",
                "//div[contains(text(),'Ada, Klinik Apotek')]",
                "//div[contains(text(),'Aditya Medical Center, Klinik Spesialis')]",
                "//div[contains(text(),'Afiat Medical Center, Klinik Spesialis')]",
                "//div[contains(text(),'Agung Satu, Apotek')]",
                "//div[contains(text(),'Agung, Rumah Sakit')]",
                "//div[contains(text(),'Alfa, Apotek')]",
                "//div[contains(text(),'Alvernia Agusta, Rumah Bersalin')]",
                "//div[contains(text(),'An Nisa, Rumah Bersalin')]",
                "//div[contains(text(),'An Nur, Klinik Spesialis')]",
                "//div[contains(text(),'Ananda, Klinik Apotek')]",
                "//div[contains(text(),'Ananda, Rumah Bersalin')]",
                "//div[contains(text(),'Angkasa, Klinik Apotek')]",
                "//div[contains(text(),'Anita Farma, Apotek')]",
                "//div[contains(text(),'Antasari, Apotek')]",
                "//div[contains(text(),'Arie Yani, Apotek')]",
                "//div[contains(text(),'Arie, Apotek')]",
                "//div[contains(text(),'Aries, Klinik Apotek')]",
                "//div[contains(text(),'Arjuna Husada Medical Center, Klinik Spesialis')]"

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
