package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Hooks{

    @FindBy(tagName = "body")
    private WebElement text;

    @FindBy(xpath = ".//*[@id='nav-link-yourAccount']/span[1]")
    private WebElement sign;


    public boolean isUserInHomePage() {
        return text.getText().contains(("Amazon.co.uk"));
    }

    public void clickOnSignIn() {
        sign.click();

    }
}