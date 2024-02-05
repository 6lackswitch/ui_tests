import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static org.ui.common.Driver.getDriver;

public class BaseTest {
    @BeforeSuite
    public void openPage() {
        getDriver().get("https://demoqa.com/automation-practice-form");
    }

    @AfterSuite
    public void closePage() {
        getDriver().close();
    }
}
