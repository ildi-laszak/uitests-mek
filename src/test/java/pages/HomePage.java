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
    @FindBy(name = "dc_creator")
    private WebElement authorNameField;
    @FindBy(name = "Image3")
    private WebElement searchButton;
    @FindBy(name = "dc_title")
    private WebElement titleField;

    public void load() {
        driver.get(baseUrl);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void searchByAuthorName(String name) {
        authorNameField.sendKeys(name);
        searchButton.click();
    }

    public void searchByTitle(String title) {
        titleField.sendKeys(title);
        searchButton.click();
    }
}
