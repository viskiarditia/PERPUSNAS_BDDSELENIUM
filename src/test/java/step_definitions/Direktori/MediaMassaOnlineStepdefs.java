package step_definitions.Direktori;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class MediaMassaOnlineStepdefs {
    private WebDriver webDriver;
    public MediaMassaOnlineStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go Direktori and click sub menu Media Massa Online$")
    public void clickHoverKoleksiDigitalAndGoDirektoriAndClickSubMenuMediaMassaOnline() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        Thread.sleep(1000);
        WebElement Direktori = webDriver.findElement(By.xpath("//a[.='Direktori']"));
        Direktori.click();
        Thread.sleep(1000);
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Media Massa Online']"));
        ClickSubMenu.click();
        Thread.sleep(1000);
    }

    @Then("^Click and Check All div class Media Massa Online in page$")
    public void clickAndCheckAllDivClassMediaMassaOnlineInPage() throws InterruptedException {
        String[] xpathArray = {
                "//div[contains(text(),'101 Jak FM.COM')]",
                "//div[contains(text(),'Aceh News')]",
                "//div[contains(text(),'Acehvideo.tv')]",
                "//div[contains(text(),'Ada kita news')]",
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
