package steps;

import org.openqa.selenium.WebDriver;
import pages.mainPage;

public class step2{
    
    WebDriver driver;
    mainPage mainPageObj;

    public step2(WebDriver driver) {
        this.driver=driver;
        mainPageObj=new mainPage(driver);
    }
    
    public void ClickLogin(){
        mainPageObj.FindLoginButton().click();
    }    
}
