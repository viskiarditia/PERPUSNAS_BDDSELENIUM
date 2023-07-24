package step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import static step_definitions.Hooks.webDriver;

public class BerandaReviewSteps {
    private WebDriverWait wait;
    private JavascriptExecutor js;
    public BerandaReviewSteps() {
        // Konstruktor kosong
        super();
        this.wait = new WebDriverWait(webDriver, 15);
        this.js = (JavascriptExecutor) webDriver;
    }
    Actions actions = new Actions(webDriver);

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
        js.executeScript("window.scrollBy(0,500)", "");

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
    }

    @Then("^User Click All Content in Unit Kerja$")
    public void userClickAllContentInUnitKerja() throws InterruptedException {
        WebElement unitKerja = webDriver.findElement(By.xpath("//h3[.='Unit Kerja Perpusnas Republik Indonesia']"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", unitKerja);
        Thread.sleep(1000);

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
        js.executeScript("window.scrollBy(0,2200)", "");

        for (String selector : elementSelectors) {
            WebElement element = webDriver.findElement(By.xpath(selector));
            actions.moveToElement(element).perform();
            Thread.sleep(500);
        }
    }

    @Then("^User Click All Content in Buku Terbaru$")
    public void userClickAllContentInBukuTerbaru() throws InterruptedException {

        WebElement bukuTerbaru = webDriver.findElement(By.xpath("//h2[.='Buku Terbaru']"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", bukuTerbaru);
        WebElement judulBukuTerbaru = webDriver.findElement(By.xpath("//h3[contains(.,'Ensiklopedia nusantara')]"));
        judulBukuTerbaru.click();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0, 4000)");
        WebElement backToBeranda = webDriver.findElement(By.xpath("//a[.='Beranda']"));
        backToBeranda.click();
        Thread.sleep(1000);

    }

    @Then("^User Click All Content in Testimoni Kami$")
    public void userClickAllContentInTestimoniKami() throws InterruptedException {
        WebElement testimoniKami = webDriver.findElement(By.xpath("//h2[.='Testimoni Kami']"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", testimoniKami);
        WebElement testimoniSatu = webDriver.findElement(By.xpath("//h3[.='Testimoni PJ Wali Kota Salatiga - Sinoeng Noegroho Rachmadi']"));
        testimoniSatu.click();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0, 3000)");
        WebElement backToBeranda = webDriver.findElement(By.xpath("//a[.='Beranda']"));
        backToBeranda.click();
        Thread.sleep(1000);
    }

    @Then("^User Click All Content in Koleksi Unggulan (\\d+)$")
    public void userClickAllContentInKoleksiUnggulan(int index) throws InterruptedException {
        WebElement koleksiUnggulan = webDriver.findElement(By.xpath("//h2[.='Koleksi Unggulan']"));
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", koleksiUnggulan);
        Thread.sleep(2000);
        By slickSlideLocator = By.cssSelector(".news-area [data-index='0']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(slickSlideLocator));

        //slick slide
        List<WebElement> slickSlides = webDriver.findElements(slickSlideLocator);
        if (0 <= index && index < slickSlides.size()) {
            WebElement slickSlide = wait.until(ExpectedConditions.elementToBeClickable(slickSlides.get(index)));
            slickSlide.click();
        } else {
            throw new IndexOutOfBoundsException("Indeks " + index + " tidak valid untuk elemen slick-slide.");
        }
    }

}
