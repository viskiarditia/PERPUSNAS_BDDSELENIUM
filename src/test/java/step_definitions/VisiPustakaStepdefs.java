package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VisiPustakaStepdefs {
    private WebDriver webDriver;
    public VisiPustakaStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^click hover Koleksi Digital and go majalah online and click sub menu Visi Pustaka$")
    public void clickHoverKoleksiDigitalAndGoMajalahOnlineAndClickSubMenuVisiPustaka() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Majalah Online']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//li[.='Visi Pustaka']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @Then("^Click Volume 02 Nomor 2 - Desember Tahun 2000 and return to the previous page$")
    public void clickVolume02Nomor2DesemberTahun2000AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='visi pustaka']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 03 Nomor 1 - Juni Tahun 2001 and return to the previous page$")
    public void clickVolume03Nomor1JuniTahun2001AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='visi pustaka']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 03 Nomor 2 - Desember Tahun 2001 and return to the previous page$")
    public void clickVolume03Nomor2DesemberTahun2001AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[3]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='visi pustaka']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

}
