package KSRTC_Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	
	@FindBy(id="userName")
	public static WebElement un;
	
	@FindBy(id="password")
	public static WebElement pw;
	
	@FindBy(tagName ="a")
	public static WebElement termscondition;
	
	@FindBy(xpath="//input[@id=\"submitBtn\"]")
	public static WebElement signin;


}
