package step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static step_definitions.Hooks.webDriver;

public class BintangPusnasEduSteps {
    private JavascriptExecutor js;
    private Actions actions;
    public BintangPusnasEduSteps() {
        this.js = (JavascriptExecutor) webDriver;
        this.actions = new Actions(webDriver);
    }
    @Then("^Click menu BintangPusnasEdu and user look with hover cursor to all fitur$")
    public void clickMenuBintangPusnasEduAndUserLookWithHoverCursorToAllFitur() throws InterruptedException {
        WebElement scrollLayananKami = webDriver.findElement(By.xpath("//h2[.='Layanan Kami']"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", scrollLayananKami);
        Thread.sleep(1000);
        WebElement BintangPusnasEdu = webDriver.findElement(By.xpath("//section[@class='features-area offer-area pt-100 pb-70']//div[@class='col-xl-4 col-lg-6 col-md-6 col-sm-6']/div[.='BintangPusnas EduPerpustakaan Menjangkau Masyarakat']"));
        BintangPusnasEdu.click();
        Thread.sleep(5000);
        WebElement ios = webDriver.findElement(By.xpath("//a[contains(.,'ios')]"));
        ios.click();


//        String[] elementSelectors = {
//                "//div[@class='row match-height']/div[1]/div[@class='box-item']",
//                "//div[@class='row match-height']/div[2]/div[@class='box-item']",
//                "//div[@class='row match-height']/div[3]/div[@class='box-item']"
//
//        };
//        Thread.sleep(1000);
//        for (String selector : elementSelectors) {
//            WebElement element = webDriver.findElement(By.xpath(selector));
//            js.executeScript("arguments[0].scrollIntoView(true);", element);
//            actions.moveToElement(element).perform();
//            Thread.sleep(500);
//        }
//        String[] elementSelectorsDua = {
//                "//div[4]/div[@class='box-item']",
//                "//div[5]/div[@class='box-item']"
//        };
//
//        for (String selector2 : elementSelectorsDua) {
//            WebElement elementhaha = webDriver.findElement(By.xpath(selector2));
//            js.executeScript("arguments[0].scrollIntoView(true);", elementhaha);
//            actions.moveToElement(elementhaha).perform();
//            Thread.sleep(500);
//        }
    }
}
