package TestLeaf;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	    WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void simplealert() throws InterruptedException {
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		driver.switchTo().alert().sendKeys("Praveen Kumar");
		driver.switchTo().alert().accept();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("j_idt88:j_idt106")).click();
		driver.findElement(By.id("j_idt88:j_idt108")).click();
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		driver.findElement(By.name("j_idt88:j_idt111")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//span[@class='ui-icon ui-icon-closethick']")).click();
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"j_idt88:j_idt101\"]//span[@ class=\"ui-icon ui-icon-closethick\"]")).click();
	}
	@Test
	public void closebrowser() {
		driver.quit();
	}
	

}
