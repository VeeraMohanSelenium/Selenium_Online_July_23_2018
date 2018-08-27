package POMFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pages {
	
	@FindBy(how=How.XPATH, using="//input[@id='txtUsername']")
	WebElement UserName;
    @FindBy(how=How.XPATH, using="//input[@id='txtPassword']")
    WebElement Password;
    
    @FindBy(how=How.ID, using="btnLogin")
    WebElement login;
    
    public void loginhome()
    
    {
    	UserName.sendKeys("user01");
    	
    	Password.sendKeys("pass1234");
    	
    	login.click();
    	
    }
    		
}
