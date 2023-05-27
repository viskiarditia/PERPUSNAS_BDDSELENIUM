package step_definitions.MajalahOnline;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hooks;

public class WartaStepdefs {
    private WebDriver webDriver;
    public WartaStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^click hover Koleksi Digital and go majalah online and click sub menu Warta$")
    public void clickHoverKoleksiDigitalAndGoMajalahOnlineAndClickSubMenuWarta() throws InterruptedException {
        WebElement KoleksiDigital= webDriver.findElement(By.xpath("//a[.='Koleksi Digital']"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(KoleksiDigital).perform();
        WebElement majalahOnline = webDriver.findElement(By.xpath("//a[.='Majalah Online']"));
        actions.moveToElement(majalahOnline).perform();
        WebElement ClickSubMenu = webDriver.findElement(By.xpath("//a[.='Warta']"));
        ClickSubMenu.click();
        Thread.sleep(500);
    }

    @Then("^Click Volume 19 Nomor 1 - Januari Tahun 2014 and return to the previous page$")
    public void clickVolume19Nomor1JanuariTahun2014AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='warta']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

    @Then("^Click Volume 19 Nomor 1 - April Tahun 2014 and return to the previous page$")
    public void clickVolume19Nomor1AprilTahun2014AndReturnToThePreviousPage() throws InterruptedException {
        WebElement clickElement = webDriver.findElement(
                By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]"));
        clickElement.click();
        Thread.sleep(2000);
        WebElement PreviousPage = webDriver.findElement(
                By.xpath("//a[.='warta']"));
        PreviousPage.click();
        Thread.sleep(1000);
    }

}
