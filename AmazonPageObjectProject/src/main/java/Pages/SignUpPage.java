package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Pages.Hooks.driver;

public class SignUpPage extends Hooks {



    @FindBy(xpath = ".//*[@id='ap_email']")
    private WebElement enteremail;

    @FindBy(xpath = ".//*[@id='ap_password']")
    private WebElement enterpwd;

    @FindBy(xpath = ".//*[@id='signInSubmit']")
    private  WebElement clickonsigbu;
    public void entertheemail(String email) {
        enteremail.sendKeys(email);
    }

    public void enterthepassword(String password) {
        enterpwd.sendKeys(password);

    }

    public void clickonthebutton(String button) {
        clickonsigbu.click();
    }
}
