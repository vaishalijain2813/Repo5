package steps;

import com.typesafe.config.Config;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.KekaPage1;
import utilities.ConfigLoader;
public class KekaPageStesNew {
    KekaPage1 kekaPage1;
    static Config config = ConfigLoader.load();

    @Given("^Open link of keka\\.$")
    public void openLinkOfKeka()
    {
        kekaPage1.getDriver().manage().window().maximize();
        kekaPage1.openUrl(config.getString("webdriver_base_url4"));
    }

    @Then("^User on Keka Login Page\\.$")
    public void userOnKekaLoginPage()
    {
    kekaPage1.LoginWithKekaTool();
    }
    @Then("^Enter credentials in fields \"([^\"]*)\" and \"([^\"]*)\"\\.$")
    public void enterCredentialsInFieldsAnd(String arg0, String arg1)
    {
        kekaPage1.EnterCredentialsAndSignInOnKeka(arg0,arg1);
    }

    @Given("^Click on all left pane tabs and verify successful landing\\.$")
    public void clickOnAllLeftPaneTabsAndVerifySuccessfulLanding()
    {
        kekaPage1.VerifyKekaLeftPaneTabs();
    }
}
