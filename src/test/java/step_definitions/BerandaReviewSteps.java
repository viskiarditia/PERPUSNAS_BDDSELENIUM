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

}
