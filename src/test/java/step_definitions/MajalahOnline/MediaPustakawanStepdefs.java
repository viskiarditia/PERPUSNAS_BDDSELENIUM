package step_definitions.MajalahOnline;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class MediaPustakawanStepdefs {
    private WebDriver webDriver;
    public MediaPustakawanStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go majalah online and click sub menu Media  Pustakawan$")
    public void clickHoverKoleksiDigitalAndGoMajalahOnlineAndClickSubMenuMediaPustakawan() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Majalah Online']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//li[.='Media Pustakawan']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @Then("^Click Volume 17 Nomor 3 - Juni Tahun 2010 and return to the previous page$")
    public void clickVolume17Nomor3JuniTahun2010AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='media pustakawan']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }


    @Then("^Click Volume 19 Nomor 1 - Maret Tahun 2012 and return to the previous page$")
    public void clickVolume19Nomor1MaretTahun2012AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='media pustakawan']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 19 Nomor 2 - April Tahun 2012 and return to the previous page$")
    public void clickVolume19Nomor2AprilTahun2012AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[3]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='media pustakawan']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 2 Nomor 2 - Juli Tahun 1995 and return to the previous page$")
    public void clickVolume2Nomor2JuliTahun1995AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[4]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='media pustakawan']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 20 Nomor 1 - April Tahun 2013 and return to the previous page$")
    public void clickVolume20Nomor1AprilTahun2013AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[5]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='media pustakawan']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }


    @Then("^Click Volume 20 Nomor 2 - Januari Tahun 2013$")
    public void clickVolume20Nomor2JanuariTahun2013() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[6]"));
        clickElement.click();
        Thread.sleep(2000);
    }
}
