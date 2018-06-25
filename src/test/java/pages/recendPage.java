package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class recendPage {
    
    WebDriver driver;
    By Submit = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button"); 
    By s11 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button");
    By s12 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[2]/button");
    By s21 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button");
    By s22 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[2]/button");
    By s23 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[3]/button");
    By s24 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[4]/button");
    By s25 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[5]/button");
    By s31 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button");
    By s32 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[2]/button");
    By CheckMess = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/div");
    By RecendEmail = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button");
    By Twitter = By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a");
    
    
    By[] s1={s11,s12};
    By[] s2={s21,s22,s23,s24,s25};
    By[] s3={s31,s32};
    
    public recendPage(WebDriver driver){
	this.driver = driver;
    }
    
    public static By getRandomItem(By[] array) {
	int itemIndex = (int)(Math.random()*array.length);
	return array[itemIndex];
    }
    
    public WebElement FindFirstAnswer(){
        return driver.findElement(getRandomItem(s1));
    }
    
    public WebElement FindSecondAnswer(){
        return driver.findElement(getRandomItem(s2));
    }
    
    public WebElement FindThirdAnswer(){
        return driver.findElement(getRandomItem(s3));
    }
    
    public WebElement FindSubmitButton(){
        return driver.findElement(Submit);
    }
    
    public WebElement FindCheckMess(){
        return driver.findElement(CheckMess);
    }
    
    public WebElement FindRecend(){
        return driver.findElement(RecendEmail);
    }
    
    public WebElement FindTwitter(){
        return driver.findElement(Twitter);
    }
 
    public WebElement FindTwitterIco(){
        WebElement svg=(WebElement)((JavascriptExecutor) driver).executeScript("return document.querySelector('.wg-footer__social-icon');"); 
        WebElement xlink=(WebElement)((JavascriptExecutor) driver).executeScript("return arguments[0]", svg);
        String actualxlink = xlink.findElement(By.tagName("use")).getAttribute("xlink:href"); 
        
        int startIndex=actualxlink.indexOf('#');
        String s=actualxlink.substring(startIndex+1, actualxlink.length());
        
        driver.navigate().to("http://www.wrike.com"+actualxlink);
        
        return driver.findElement(By.id(s));
    }  
}
