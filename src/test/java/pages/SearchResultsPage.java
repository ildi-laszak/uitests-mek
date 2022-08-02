package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(partialLinkText = "Keresőkérdés:")
    private WebElement searchedKeyword;
    @FindBy(partialLinkText = "holdvilág")
    private WebElement firstSearchResult;
    @FindBy(css = "td.cimtd:nth-child(2)>b")
    private WebElement resultNumber;

    public boolean isLoaded() {
        wait.until(ExpectedConditions.visibilityOf(searchedKeyword)).isDisplayed();
        return searchedKeyword.isDisplayed();
    }

    public String getFirstSearchResult() {
        wait.until(ExpectedConditions.visibilityOf(firstSearchResult)).isDisplayed();
        return firstSearchResult.getText();
    }

    public String getResultsNumber(){
        wait.until(ExpectedConditions.visibilityOf(resultNumber)).isDisplayed();
        return resultNumber.getText();
    }
}
