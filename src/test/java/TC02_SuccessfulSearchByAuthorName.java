import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Feature("Homepage UI")
public class TC02_SuccessfulSearchByAuthorName extends BaseTest {
    @Test
    @DisplayName("Successful search by Author keyword")
    @Description("The Results Page should load successfully")
    public void successfulPageLoad() {
        LOG.info("Filling in author Name field form and clicking search button");
        homePage.searchByAuthorName("Szerb Antal");
        LOG.info("Asserting if SearchResultsPage is loaded");
        assertThat(searchResultsPage.isLoaded()).isTrue();
    }
}
