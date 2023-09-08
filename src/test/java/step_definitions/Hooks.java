package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void openBrowser(){
        ChromeOptions a = new ChromeOptions();
        //   a.addArguments("--no-sandbox");
        //   a.addArguments("--disable-dev-shm-usage");
        //   a.addArguments("--headless");
        a.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver(a);
        String URL = "https://www.perpusnas.go.id/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.quit();

    }

}