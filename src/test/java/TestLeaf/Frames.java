package TestLeaf;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();				
	}
	
	@Test
	public void frame1() {
		WebElement f1=driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
		driver.switchTo().frame(f1);
		driver.findElement(By.id("Click")).click();
	}
	
	@Test
	public void frame2() {
		driver.switchTo().parentFrame();
		WebElement f2=driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(f2);
      	WebElement f3=driver.findElement(By.xpath("//iframe[@src=\"framebutton.xhtml\"]"));
      	driver.switchTo().frame(f3);
      	driver.findElement(By.id("click")).click();
	}
	
	@Test
	public void frame3() {
		driver.switchTo().parentFrame();
		List<WebElement> f4= driver.findElements(By.tagName("iframe"));
		int totalframes=f4.size();
		System.out.println(totalframes);
	}
	@Test
	public void closebrowser() {
		driver.quit();
	}

}
