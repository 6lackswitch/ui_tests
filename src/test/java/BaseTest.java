import org.testng.annotations.AfterSuite;

import static org.ui.common.Driver.getDriver;

public class BaseTest {
    @AfterSuite
    public void closePage() {
        getDriver().close();
    }
}
