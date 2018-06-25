package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class freeTrial {
    
    WebDriver driver;
    By GetStartedForFree = By.xpath("//*[@id=\"modal-pro\"]/form/label[1]/input");
    By CreateAccount = By.xpath("//*[@id=\"modal-pro\"]/form/label[2]/button");
    
    public freeTrial(WebDriver driver){
	this.driver = driver;
    }
    
    public WebElement FindMailField(){
        return driver.findElement(GetStartedForFree);
    }
    
    public WebElement FindCreateAccount(){
        return driver.findElement(CreateAccount);
    }  
}
