package ToolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forms {
	
	WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void closebrowser() {
		driver.quit();
	}
	

}
