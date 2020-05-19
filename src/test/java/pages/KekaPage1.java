package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import java.util.Set;
import java.util.concurrent.TimeUnit;

    public class KekaPage1 extends PageObject {
        @FindBy(xpath = "//button[text()='Login with Keka Password']")
        WebElementFacade login;
        @FindBy(id = "email")
        WebElementFacade email;
        @FindBy(id = "password")
        WebElementFacade password;
        @FindBy(xpath = "//button[text()='Login']")
        WebElementFacade button1;
        @FindBy(xpath = "//a[@href='/ui/#/me/leave']")
        WebElementFacade me;
        @FindBy(xpath = "//a[@href='#/inbox']")
        WebElementFacade inbox;
        @FindBy(xpath = "//a[@href='#/myteam/summary']")
        WebElementFacade myTeam;
        @FindBy(xpath = "//a[@href='/old/#/finances/summary']")
        WebElementFacade finance;
        @FindBy(xpath = "//a[@href='/old/#/todos']")
        WebElementFacade todo;
        @FindBy(xpath = "//a[@href='/ui/#/org/employees/directory']")
        WebElementFacade org;
        @FindBy(xpath = "//button[text()='OK']")
        WebElementFacade okButton;

        public void switchToLatestTab() {
            Set<String> windows = getDriver().getWindowHandles();
            for (String ws : windows) {
                getDriver().switchTo().window(ws);
            }
        }

        public void LoginWithKekaTool()
        {
            login.withTimeoutOf(20, TimeUnit.SECONDS).click();
        }

        public void EnterCredentialsAndSignInOnKeka(String arg0, String arg1) {
            switchToLatestTab();
            email.withTimeoutOf(10, TimeUnit.SECONDS).sendKeys(arg0);
            password.withTimeoutOf(10, TimeUnit.SECONDS).sendKeys(arg1);
            button1.withTimeoutOf(10, TimeUnit.SECONDS).click();
        }
        public void VerifyKekaLeftPaneTabs() {

            me.withTimeoutOf(10,TimeUnit.SECONDS).click();//To verify "me" Tab by clicking on it.
            waitABit(2000);
            boolean verify= (getDriver().findElement(By.xpath("//h4[text()='Pending leave requests']")).isDisplayed());
            Assert.assertTrue(verify);
            if(verify)
               System.out.println("Successfully landed");
            else
               System.out.println("Not landed successfully");

            inbox.withTimeoutOf(10,TimeUnit.SECONDS).click();  //To verify "inbox" Tab by clicking on it.
            waitABit(3000);
            boolean verify1=(getDriver().findElement(By.xpath("//a[@routerlink='action']"))).isDisplayed();
            Assert.assertTrue(verify1);
            if(verify1)
                System.out.println("Successfully landed");
            else
                System.out.println("Not landed successfully");

            myTeam.withTimeoutOf(10,TimeUnit.SECONDS).click();  //To verify "myTeam" Tab by clicking on it.
            waitABit(2000);
            boolean verify2=(getDriver().findElement(By.xpath("//a[@routerlink='summary']"))).isDisplayed();
            Assert.assertTrue(verify2);
            if(verify2)
                System.out.println("Successfully landed");
            else
                System.out.println("Not landed successfully");
            finance.withTimeoutOf(10,TimeUnit.SECONDS).click(); //To verify "Finance" Tab by clicking on it.
            waitABit(2000);
            boolean verify3=(getDriver().findElement(By.xpath("//button[text()='OK']"))).isDisplayed();
            Assert.assertTrue(verify3);
            if(verify3)
                System.out.println("Successfully landed");
            else
                System.out.println("Not landed successfully");

            okButton.click();

            todo.withTimeoutOf(10,TimeUnit.SECONDS).click(); //To verify "To do" Tab by clicking on it.
            boolean verify4=(getDriver().findElement(By.xpath("//h3[text()='Lists']"))).isDisplayed();
            Assert.assertTrue(verify4);
            if(verify4)
                System.out.println("Successfully landed");
            else
                System.out.println("Not landed successfully");

            org.withTimeoutOf(10,TimeUnit.SECONDS).click(); //To verify "org" Tab by clicking on it.
            boolean verify5=(getDriver().findElement(By.xpath("//a[@routerlink='employees']"))).isDisplayed();
            Assert.assertTrue(verify5);
            if(verify5)
                System.out.println("Successfully landed");
            else
                System.out.println("Not landed successfully");

        }
    }
