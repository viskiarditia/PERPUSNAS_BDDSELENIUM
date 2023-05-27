package step_definitions.Kamus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class IstilahPerpustakaanStepdefs {
    private WebDriver webDriver;
    public IstilahPerpustakaanStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^click hover Koleksi Digital and go Kamus and click sub menu Istilah Perpustakaan$")
    public void clickHoverKoleksiDigitalAndGoKamusAndClickSubMenuIstilahPerpustakaan() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Kamus']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Istilah Perpustakaan']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @And("^Scroll Down page for next one step Istilah Perpustakaan$")
    public void scrollDownPageForNextOneStepIstilahPerpustakaan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Perpustakaan 1")
    public void clickDivClassIstilahPerpustakaan1() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[@class='!grid !grid-cols-12 !gap-4 !relative']//div[@class='accordion__heading']/div[.='AACR']"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Perpustakaan 2")
    public void clickDivClassIstilahPerpustakaan2() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[@class='!grid !grid-cols-12 !gap-4 !relative']//div[@class='accordion__heading']/div[.='AACR 2']"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Perpustakaan 3")
    public void clickDivClassIstilahPerpustakaan3() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[@class='!grid !grid-cols-12 !gap-4 !relative']/div[3]//div[@id='accordion__heading-e']"));
        clickElement.click();
        Thread.sleep(2000);
    }

}
