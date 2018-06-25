package steps;

import org.openqa.selenium.WebDriver;

public class step1 {
    
    WebDriver driver;
    
    public step1(WebDriver driver) {
        this.driver=driver;
    }
    
    public void OpenUrl(String url){
      driver.navigate().to(url);
      driver.manage().window().maximize();
    }    
}
    
