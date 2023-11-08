package ToolsQA;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {
	
WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();	
	}
	
	
	@Test
	public void Elements1() throws InterruptedException {
		Actions a1=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Praveen kumar R");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("praveenkumar@sdtech.io");
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("Workafella, SDTech, Teynampet");
		driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("Workafella, SDTech, Teynampet");
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("submit")).click();
		//Thread.sleep(5000);
    	a1.sendKeys(Keys.PAGE_UP).build().perform();
    	driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
    	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]/svg")).click();
    	
		
	}
	
	@Test
	public void closebrowser() {
		driver.quit();
	}

}
