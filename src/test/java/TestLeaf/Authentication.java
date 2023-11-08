package TestLeaf;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authentication {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();				
	}

	
	@Test
	public void aut() throws InterruptedException {
		String username="admin";
		String password="testleaf";
		String url="http://"+username+":"+password+"@"+"leafground.com:8090";
		driver.findElement(By.xpath("//li[@id=\"menuform:j_idt38\"]")).click();
		driver.findElement(By.id("menuform:m_auth")).click();
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		Thread.sleep(5000);
		driver.get(url);
		System.out.println("Link opened");
	}
	
	@Test
	public void closebrowser() {
		driver.quit();
	}

}
