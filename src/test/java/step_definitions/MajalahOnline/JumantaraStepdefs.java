package step_definitions.MajalahOnline;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

import javax.swing.*;
import java.security.SecureRandom;

public class JumantaraStepdefs {
    private WebDriver webDriver;
    public JumantaraStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^click hover Koleksi Digital and go majalah online and click sub menu Jumantara$")
    public void clickHoverKoleksiDigitalAndGoMajalahOnlineAndClickSubMenuJumantara() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Majalah Online']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Jumantara']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @And("^Scroll Down page for next one step$")
    public void scrollDownPageForNextOneStep() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
    }

    @And("^Scroll Down page for next two step$")
    public void scrollDownPageForNextTwoStep() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);
    }

    @And("^Scroll Down page for next three step$")
    public void scrollDownPageForNextThreeStep() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1400)", "");
        Thread.sleep(2000);
    }

    //Tahap 1

    @Then("^Click Jumantara Volume 6 Nomor 1 - Tahun 2015 and return to the previous page$")
    public void clickJumantaraVolume6Nomor1Tahun2015AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Jumantara Volume 6 Nomor 2 - Tahun 2015 and return to the previous page$")
    public void clickJumantaraVolume6Nomor2Tahun2015AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Jumantara Volume 7 Nomor 1 - Tahun 2016 and return to the previous page$")
    public void clickJumantaraVolume7Nomor1Tahun2016AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[3]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    //Tahap 2

    @Then("^Click Jumantara Volume 7 Nomor 2 - Tahun 2016 and return to the previous page$")
    public void clickJumantaraVolume7Nomor2Tahun2016AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[4]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Jumantara Volume 8 Nomor 1 - Tahun 2017 and return to the previous page$")
    public void clickJumantaraVolume8Nomor1Tahun2017AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[5]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Jumantara Volume 8 Nomor 2 - Tahun 2017 and return to the previous page$")
    public void clickJumantaraVolume8Nomor2Tahun2017AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[6]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    //Tahap 3

    @Then("^Click Jumantara Volume 9 Nomor 1 - Tahun 2018 and return to the previous page$")
    public void clickJumantaraVolume9Nomor1Tahun2018AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[7]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Jumantara Volume 9 Nomor 2 - Tahun 2018 and return to the previous page$")
    public void clickJumantaraVolume9Nomor2Tahun2018AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//div[8]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 9 Nomor 1 - Oktober Tahun 2010 and return to the previous page$")
    public void clickJumantaraVolume9Nomor1OktoberTahun2010AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[9]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    //Tahap 4

    @Then("^Click Volume 2 Nomor 1 - April Tahun 2010 and return to the previous page$")
    public void clickVolume2Nomor1AprilTahun2010AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[10]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 2 Nomor 2 - Oktober Tahun 2011 and return to the previous page$")
    public void clickVolume2Nomor2OktoberTahun2011AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[11]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 3 Nomor 1 - April Tahun 2012 and return to the previous page$")
    public void clickVolume3Nomor1AprilTahun2012AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[12]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='jumantara']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

}
