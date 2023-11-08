package TestLeaf;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml;jsessionid=node0ytbwemz1dutg8bq8t7met663544222.node0");
		driver.manage().window().maximize();				
	}

	@Test(priority=1)
	public void window1() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id=\"menuform:j_idt39\"]")).click();
		driver.findElement(By.xpath("//li[@id=\"menuform:m_window\"]")).click();
		String name=driver.getTitle();
		System.out.println(name);
		driver.findElement(By.id("j_idt88:j_idt93")).click();		
	}
	
	@Test(priority=2)
	public void window3() {
		
		driver.findElement(By.cssSelector("button[id=\"j_idt88:j_idt91\"]")).click();
		Set<String> total=driver.getWindowHandles();
		Iterator <String>i1=total.iterator();
		while(i1.hasNext()) {
			int i=0;
			i++;
			System.out.println(i);
			break;
		}

	}

	@Test(priority=4)
	public void window2() {
		String mainwindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator< String>i1=s1.iterator();
		while(i1.hasNext()) {
			String childwindow=i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
			}
		}
	}
	@Test(priority=3)
	public void Window4() throws InterruptedException {
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		Thread.sleep(5000);
		
		
		
		
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

	

}


