import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver;
    protected Logger LOG;
    protected HomePage homePage;
    protected SearchResultsPage searchResultsPage;

    @BeforeAll
    public void setup() throws IOException {
        LOG = LoggerFactory.getLogger(getClass());
        LOG.info("Setting up browser");
        String browser;
        LOG.debug("Reading test.properties");
        InputStream inputStream = this.getClass().getResourceAsStream("test.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        browser = properties.getProperty("browser");
        if (browser.equals("chrome")) {
            LOG.info("Setting up chromedriver");
            WebDriverManager.chromedriver().setup();
            LOG.debug("Creating chromedriver object");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            LOG.info("Setting up firefoxdriver");
            WebDriverManager.firefoxdriver().setup();
            LOG.debug("Creating firefoxdriver object");
            driver = new FirefoxDriver();
        } else {
            LOG.info("Setting up safaridriver");
            WebDriverManager.safaridriver().setup();
            LOG.debug("Creating safaridriver object");
            driver = new SafariDriver();
        }
        LOG.info("Maximizing browser");
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void loadPage() {
        LOG.debug("Creating HomePage object");
        homePage = new HomePage(driver);
        LOG.info("Loading Home page");
        homePage.load();
        LOG.debug("Creating searchResultsPage object");
        searchResultsPage = new SearchResultsPage(driver);
    }

    @AfterAll
    public void tearDown() {
        LOG.info("Quitting driver");
        if (driver != null) {
            driver.quit();
        }
    }
}
