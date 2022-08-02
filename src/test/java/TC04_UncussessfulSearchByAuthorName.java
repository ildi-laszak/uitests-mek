import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Feature("Homepage UI")
public class TC04_UncussessfulSearchByAuthorName extends BaseTest{
    @Test
    @DisplayName("Unsuccessful search by Author name")
    @Description("A non-existent author name should return zero results")
    public void successfulPageLoad() {
        LOG.info("Filling in author Name field form and clicking search button");
        homePage.searchByAuthorName("qwer");
        LOG.info("Asserting if number of results are 0");
        assertThat(searchResultsPage.getResultsNumber()).isEqualTo("0");
    }
}
