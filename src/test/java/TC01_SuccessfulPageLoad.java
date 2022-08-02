import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Feature("Homepage UI")
public class TC01_SuccessfulPageLoad extends BaseTest{
    @Test
    @DisplayName("Successful page load")
    @Description("The Homepage should load successfully")
    public void successfulPageLoad(){
        LOG.info("Asserting if HomePage is loaded");
        assertThat(homePage.getTitle()).isEqualTo("MEK (Magyar Elektronikus Könyvtár)");
    }
}
