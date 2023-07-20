package step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static step_definitions.Hooks.webDriver;

public class BerandaReviewSteps {
    @Then("^User Hover All Content in Beranda Layanan Kami$")
    public void userHoverAllContentInBerandaLayananKami() throws InterruptedException {
        String[] elementSelectors = {
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[3]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[5]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[6]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[7]/div[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[8]/div[1]",
        };
        Actions actions = new Actions(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)", "");

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
    }

    @Then("^User Click All Content in Unit Kerja$")
    public void userClickAllContentInUnitKerja() throws InterruptedException {
        String[] elementSelectors = {
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]",
                "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[9]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[11]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[12]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[13]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[14]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[15]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[16]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[17]",

        };
        Actions actions = new Actions(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1800)", "");

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
    }

    @Then("^User Click All Content in Berita Terbaru$")
    public void userClickAllContentInBeritaTerbaru() throws InterruptedException {
        String[] elementSelectors = {
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/h3[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/h3[1]",
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/h3[1]",
        };
        Actions actions = new Actions(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,2200)", "");

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
    }
}
