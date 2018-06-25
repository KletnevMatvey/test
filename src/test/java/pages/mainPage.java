package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {

    WebDriver driver;
    By Login = By.xpath("/html/body/div[1]/header/div[2]/div[2]/div/div/div[2]/div/form/a");
    By GetStartedForFree = By.xpath("/html/body/div[1]/header/div[2]/div[2]/div/div/div[2]/div/form/button");  

    public mainPage(WebDriver driver){
	this.driver = driver;
    }
    
    public WebElement FindLoginButton(){
        return driver.findElement(Login);
    }
    
    public WebElement FindGetStartedForFreeButton(){
        return driver.findElement(GetStartedForFree);
    }    
}
