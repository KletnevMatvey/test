package steps;

import org.openqa.selenium.WebDriver;
import pages.loginPage;

public class step3 {
    
    WebDriver driver;
    loginPage loginPageObj;

    public step3(WebDriver driver) {
        this.driver=driver;
        loginPageObj=new loginPage(driver);
    }
    
    public void ClickCreateAccount(){
        loginPageObj.FindCreateAccountButton().click();
    }    
    
}
