package step_definitions.Direktori;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class PerpustakaanKhususInternetStepdefs {
    private WebDriver webDriver;
    public PerpustakaanKhususInternetStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go Direktori and click sub menu Perpustakaan Khusus Internet$")
    public void clickHoverKoleksiDigitalAndGoDirektoriAndClickSubMenuPerpustakaanKhususInternet() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        Thread.sleep(1000);
        WebElement Direktori = webDriver.findElement(By.xpath("//a[.='Direktori']"));
        Direktori.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Perpustakaan Khusus']"));
        ClickSubMenu.click();
        Thread.sleep(1000);
    }

    @Then("^Click and Check All div class Perpustakaan Khusus Internet in page$")
    public void clickAndCheckAllDivClassPerpustakaanKhususInternetInPage() throws InterruptedException {
        String[] xpathArray = {
                "//div[contains(text(),'Perpustakaan Badan Doklat Daerah Provinsi Lampung')]",
                "//div[contains(text(),'Perpustakaan Badan Tenaga Atom Nasional')]",
                "//div[contains(text(),'Perpustakaan Balai Pengkajian Teknologi Pertanian ')]",
                "//div[contains(text(),'Perpustakaan Biro Organisasi Setda Provinsi Jambi')]",
                "//div[5]",
                "//div[6]",
                "//div[7]",
                "//div[8]",
                "//div[9]",
                "//div[10]",
                "//div[11]",
                "//div[12]",
                "//div[13]",
                "//div[14]",
                "//div[15]",
                "//div[16]",
                "//div[17]",
                "//div[18]",
                "//div[19]",
                "//div[20]",
                "//div[21]",
                "//div[22]",
                "//div[23]"
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
