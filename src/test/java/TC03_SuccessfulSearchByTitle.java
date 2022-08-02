import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Feature("Homepage UI")
public class TC03_SuccessfulSearchByTitle extends BaseTest {
    @Test
    @DisplayName("Successful search by Title keyword")
    @Description("The Results Page should load successfully")
    public void successfulPageLoad() {
        LOG.info("Filling in book title field form and clicking search button");
        homePage.searchByTitle("holdvilág");
        LOG.info("Asserting if SearchResults contain the searched keyword");
        assertThat(searchResultsPage.getFirstSearchResult()).contains("holdvilág");
    }
}
