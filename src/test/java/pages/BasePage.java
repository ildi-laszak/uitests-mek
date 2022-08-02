package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected String baseUrl;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;
    protected Logger LOG;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://mek.oszk.hu";
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
        LOG = LoggerFactory.getLogger(getClass());
    }
}
