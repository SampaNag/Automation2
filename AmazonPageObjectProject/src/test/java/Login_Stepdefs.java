import Pages.HomePage;
import Pages.Hooks;
import Pages.SignUpPage;
import Pages.WebDriverUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_Stepdefs extends Hooks {
    HomePage homePage;
    SignUpPage signUpPage;

    @Given("^user is on amazon home page$")
    public void userIsOnAmazonHomePage() {
        homePage=new HomePage();
        System.out.println("user is in home page");
        Assert.assertTrue(homePage.isUserInHomePage());

    }


    @When("^user clicks \"([^\"]*)\" link$")
    public void userClicksLink(String arg0) {
        homePage.clickOnSignIn();

    }


    @And("^user types valid email \"([^\"]*)\"$")
    public void userTypesValidEmail(String email) {
        signUpPage = new SignUpPage();
        signUpPage.entertheemail(email);
    }


    @And("^user types valid password \"([^\"]*)\"$")
    public void userTypesValidPassword(String password) {
        signUpPage.enterthepassword(password);

    }


    @And("^user clicks \"([^\"]*)\" button$")
    public void userClicksButton(String button) {
        System.out.println("click sign in button");
        signUpPage.clickonthebutton(button);

    }

    @Then("^user should landed on \"([^\"]*)\" page$")
    public void userShouldLandedOnPage(String may) {

Assert.assertTrue(WebDriverUtil.isTextPresent(may));
        boolean isTextPresent = driver.getPageSource().contains(may);


    }
}



