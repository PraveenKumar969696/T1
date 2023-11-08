package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	WebDriver driver;

	@Test
	public void b1() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
	}
	
	@Test
	public void drop1() {
		WebElement l1=driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
		Select s1=new Select(l1);
		s1.selectByIndex(4);
		Select s2=new Select( driver.findElement(By.xpath("//span[@class=\"ui-button-text\"]")));
	}

}
