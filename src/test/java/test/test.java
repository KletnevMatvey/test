package test;
 
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.*;

 
public class test {
 
	WebDriver driver;
        step1 step1Obj;
        step2 step2Obj;
        step3 step3Obj;
        step4 step4Obj;
        step5 step5Obj;
        step6 step6Obj;
        step7 step7Obj;
        step8 step8Obj;
        step9 step9Obj;
	
	@Test
	public void testcase() throws Exception{
            
        WebDriver driver  = new ChromeDriver();
        
        step1Obj=new step1(driver);
        step1Obj.OpenUrl("http://wrike.com");
            
        step2Obj=new step2(driver);
        step2Obj.ClickLogin();
        
        step3Obj=new step3(driver);
        step3Obj.ClickCreateAccount();  
        
        step4Obj=new step4(driver);
        step4Obj.ClickGetStartedForFree();
        
        step5Obj=new step5(driver);
        step5Obj.SetMailField();
        
        step6Obj=new step6(driver);
        step6Obj.ClickCreateAccount();
        Thread.sleep(2000);
        step6Obj.Check();
        
        step7Obj=new step7(driver);
        step7Obj.HideFooter();
        step7Obj.ChooseAnswer();
        step7Obj.ClickSubmit();
        Thread.sleep(3000);
        step7Obj.Check();
        step7Obj.ShowFooter();
        
        step8Obj=new step8(driver);
        step8Obj.ClickRecend();
        Thread.sleep(3000);
        step8Obj.Check();
        
        step9Obj=new step9(driver);
        step9Obj.CheckLink();
        step9Obj.CheckIco();
         
        driver.quit();
        }
}
