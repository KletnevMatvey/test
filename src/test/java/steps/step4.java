package steps;

import org.openqa.selenium.WebDriver;
import pages.mainPage;

public class step4 {
    
    WebDriver driver;
    mainPage mainPageObj;

    public step4(WebDriver driver) {
        this.driver=driver;
        mainPageObj=new mainPage(driver);
    }
    
    public void ClickGetStartedForFree(){
        mainPageObj.FindGetStartedForFreeButton().click();
    } 
    
}
