package step_definitions.Kamus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class IstilahKomputerStepdefs {
    private WebDriver webDriver;
    public IstilahKomputerStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^click hover Koleksi Digital and go Kamus and click sub menu Istilah Komputer$")
    public void clickHoverKoleksiDigitalAndGoKamusAndClickSubMenuIstilahKomputer() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Kamus']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Istilah Komputer']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @And("^Scroll Down page for next one step Istilah Komputer$")
    public void scrollDownPageForNextOneStepIstilahKomputer() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(2000);
    }

    @And("^Scroll Down page for next two step Istilah Komputer$")
    public void scrollDownPageForNextTwoStepIstilahKomputer() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 1$")
    public void clickDivClass1IstilahKomputer1() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'3D Studio Max')]"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 2$")
    public void clickDivClass1IstilahKomputer2() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'AAC (Advanced Audio Coding)')]"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 3$")
    public void clickDivClass1IstilahKomputer3() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'Abend (Abnormal end)')]"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 4$")
    public void clickDivClass1IstilahKomputer4() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'ABI (Application Binary Interface)')]"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 5$")
    public void clickDivClass1IstilahKomputer5() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'AbiWord')]"));
        clickElement.click();
        Thread.sleep(2000);
    }

    @Then("^Click div class Istilah Komputer 6$")
    public void clickDivClass1IstilahKomputer6() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[contains(text(),'Abort')]"));
        clickElement.click();
        Thread.sleep(2000);
    }



}
