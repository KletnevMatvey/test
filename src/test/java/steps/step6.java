package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import pages.freeTrial;

public class step6 {
    
    WebDriver driver;
    freeTrial freeTrialObj;

    public step6(WebDriver driver) {
        this.driver=driver;
        freeTrialObj=new freeTrial(driver);
    }
    
    public void ClickCreateAccount(){
        freeTrialObj.FindCreateAccount().click();
    } 
    
    public void Check(){
        String Url = driver.getCurrentUrl();
        assertEquals("https://www.wrike.com/resend/", Url);
    }
    
}
