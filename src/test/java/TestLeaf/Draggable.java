package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {
	WebDriver driver;
	
	@Test
	public void b1() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
	}
	
	@Test
	public void drag1() throws InterruptedException {
		
		Actions a1=new Actions(driver);
		driver.findElement(By.id("menuform:j_idt39")).click();
		Thread.sleep(5000);
	    driver.findElement(By.id("menuform:m_drag")).click();
	    WebElement L1= driver.findElement(By.id("form:conpnl"));
		a1.dragAndDropBy(L1, 300, 120).build().perform();
		
		WebElement l2=driver.findElement(By.id("form:drag_content"));
		WebElement l3= driver.findElement(By.id("form:drop"));
		a1.dragAndDrop(l2, l3).build().perform();
	}
	@Test
	public void closebrowser() {
		driver.quit();
	}


}
