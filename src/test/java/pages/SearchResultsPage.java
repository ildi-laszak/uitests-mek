package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(partialLinkText = "Keresőkérdés:")
    private WebElement searchedKeyword;

    public boolean isLoaded() {
        wait.until(ExpectedConditions.visibilityOf(searchedKeyword)).isDisplayed();
        return searchedKeyword.isDisplayed();
    }
}
