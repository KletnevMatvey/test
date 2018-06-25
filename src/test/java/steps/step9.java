/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.recendPage;

public class step9 {
    
    WebDriver driver;
    recendPage recendPageObj;
    String bird="M14.2 3.2v.42A9.23 9.23 0 0 1-.01 11.39a6.66 6.66 0 0 0 .78 0 6.5 6.5 0 0 0 4-1.38 3.25 3.25 0 0 1-3-2.25 4.21 4.21 0 0 0 .61 0 3.42 3.42 0 0 0 .85-.11 3.24 3.24 0 0 1-2.6-3.18 3.27 3.27 0 0 0 1.47.41 3.25 3.25 0 0 1-1-4.34 9.22 9.22 0 0 0 6.69 3.39 3.66 3.66 0 0 1-.08-.74A3.25 3.25 0 0 1 13.32.97a6.39 6.39 0 0 0 2.06-.78 3.23 3.23 0 0 1-1.43 1.79 6.5 6.5 0 0 0 1.87-.5A7 7 0 0 1 14.2 3.2z";

    public step9(WebDriver driver) {
        this.driver=driver;
        recendPageObj=new recendPage(driver);
    }
    
    public void ClickRecend(){
        recendPageObj.FindRecend().click();
    } 
    
    public void CheckLink(){
        assertEquals("https://twitter.com/wrike",recendPageObj.FindTwitter().getAttribute("href"));
    }
    
    public void CheckIco(){
        String vector=recendPageObj.FindTwitterIco().findElement(By.tagName("path")).getAttribute("d");
        assertEquals(bird,vector);  
    }
    
}
