package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.recendPage;

public class step7 {
    
    WebDriver driver;
    recendPage recendPageObj;

    public step7(WebDriver driver) {
        this.driver=driver;
        recendPageObj=new recendPage(driver);
    }
    
    public void ChooseAnswer(){
        recendPageObj.FindFirstAnswer().click();
        recendPageObj.FindSecondAnswer().click();
        recendPageObj.FindThirdAnswer().click();
    }
    
    public void HideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('wg-footer')[0].style.display = 'none';");
    }
    
    public void ShowFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('wg-footer')[0].style.display = 'block';");
    }
        
    public void ClickSubmit(){
        recendPageObj.FindSubmitButton().click();
    } 
    
    public void Check(){
        assertTrue(recendPageObj.FindCheckMess().isDisplayed());
    }
    
}
