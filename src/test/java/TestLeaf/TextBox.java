package TestLeaf;

import org.testng.annotations.Test;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();				
	}
		@Test
		public void textbox() throws InterruptedException, AWTException {
			
			driver.findElement(By.xpath("//li[@id=\"menuform:j_idt40\"]")).click();
			driver.findElement(By.linkText("Text Box")).click();
			driver.findElement(By.xpath("//input[@id=\"j_idt88:name\"]")).sendKeys("Praveen kumar R");
			WebElement l1=driver.findElement(By.id("j_idt88:j_idt91"));
			l1.clear();
			l1.sendKeys("Erode");
			Boolean b1=driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt93\"]")).isEnabled();
			if(b1==false) {
				System.out.println("Disabled");
			}else {
				System.out.println("Enabled");
			}
			driver.findElement(By.id("j_idt88:j_idt95")).clear();
		    WebElement l2=driver.findElement(By.xpath("//div[@class=\"grid formgrid\"]//input[@id=\"j_idt88:j_idt97\"]"));
		    l2.click();
		    String t1=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]")).getText();	
		    System.out.println(t1);
	}
		@Test
		public void closebrowser() {
			driver.quit();
		}
	
	

}

