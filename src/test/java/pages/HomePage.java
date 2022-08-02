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

    public void load() {
        driver.get(baseUrl);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void searchByAuthorName(String name){
        authorNameField.sendKeys(name);
        searchButton.click();
    }
}
