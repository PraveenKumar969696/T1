package KSRTC_Functionality;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import KSRTC_Objectrepository.*;

public class KSRTC_Login {
	
	     WebDriver driver;
	
	@Test
	public  void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void login() throws InterruptedException {
		String colorRGB;
		PageFactory.initElements(driver, login.class);
		Actions a1=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login.un.sendKeys("praveen");
		login.pw.sendKeys("Abc@123");
		
		login.termscondition.click();
	    login.termscondition.click();
		login.signin.click();
	}
	
	@Test
	public void teardown() {
		driver.quit();
	}

}
