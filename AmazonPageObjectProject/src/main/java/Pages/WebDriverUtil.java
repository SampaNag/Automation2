package Pages;

import org.openqa.selenium.By;

public class WebDriverUtil extends Hooks {


    public static boolean isTextPresent(String text){
        try{
            return driver.findElement(By.tagName("body")).getText().contains(text);
        }
        catch(Exception e){

            return false;

        }

    }
}
