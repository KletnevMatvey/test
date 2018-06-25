package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    WebDriver driver;
    By CreateAccount = By.linkText("Create account");

    public loginPage(WebDriver driver){
	this.driver = driver;
    }
    
    public WebElement FindCreateAccountButton(){
        return driver.findElement(CreateAccount);
    }  
}
