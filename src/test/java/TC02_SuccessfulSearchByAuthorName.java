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
        homePage.enterAuthorName("Szerb Antal");
        homePage.clickSearch();
        assertThat(searchResultsPage.isLoaded()).isTrue();
    }
}
