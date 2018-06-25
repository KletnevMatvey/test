package steps;

import java.security.SecureRandom;
import org.openqa.selenium.WebDriver;
import pages.freeTrial;

public class step5 {
    
    WebDriver driver;
    freeTrial freeTrialObj;
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    static String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ) 
        sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString()+"+wpt@wriketask.qaa";
    }
    
    public step5(WebDriver driver) {
        this.driver=driver;
        freeTrialObj=new freeTrial(driver);
    }
    
    public void SetMailField(){
        freeTrialObj.FindMailField().sendKeys(randomString(6));;
    } 
    
}
