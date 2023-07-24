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
        String[] elementSelectors = {
                "/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]",
                "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]",
                "/html[1]/body[1]/section[2]/div[1]/div[1]/div[3]/div[1]"

        };
        WebElement fitur = webDriver.findElement(By.xpath("//h2[contains(text(),'Fitur')]"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", fitur);
        Thread.sleep(1000);

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
        String[] elementSelectorsDua = {
                "/html[1]/body[1]/section[2]/div[1]/div[1]/div[4]/div[1]",
                "/html[1]/body[1]/section[2]/div[1]/div[1]/div[5]/div[1]"
        };
        WebElement part4 = webDriver.findElement(By.xpath("//body/section[@id='fitur']/div[1]/div[1]/div[4]/div[1]"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", part4);
        for (String selector2 : elementSelectorsDua) {
            WebElement elementhaha = webDriver.findElement(By.xpath(selector2));
            actions.moveToElement(elementhaha).perform();
            Thread.sleep(500);
        }
    }
}
