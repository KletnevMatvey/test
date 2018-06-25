package steps;

import static org.junit.Assert.assertFalse;
import org.openqa.selenium.WebDriver;
import pages.recendPage;

public class step8 {
    
    WebDriver driver;
    recendPage recendPageObj;

    public step8(WebDriver driver) {
        this.driver=driver;
        recendPageObj=new recendPage(driver);
    }
    
    public void ClickRecend(){
        recendPageObj.FindRecend().click();
    } 
    
    public void Check(){
        assertFalse(recendPageObj.FindRecend().isDisplayed());
    }
}
