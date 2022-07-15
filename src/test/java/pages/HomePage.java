package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "title")
    private WebElement title;

    public void load() {
        driver.get(baseUrl);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
