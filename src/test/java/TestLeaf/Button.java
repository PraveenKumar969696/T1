package TestLeaf;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
	WebDriver driver;

	@Test
	public void b1() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01fi58v6yspeoe1ti9fewaoav7n547651.node0");
		driver.manage().window().maximize();
	}
	@Test
	public void button() throws InterruptedException {
		Actions a1=new Actions(driver);
		driver.findElement(By.id("menuform:j_idt39")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menuform:m_button")).click();
	    driver.findElement(By.id("j_idt88:j_idt90"));
	    String name=driver.getTitle();
	    System.out.println("title is "+name);
	    Boolean b1=driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
	    System.out.println(b1);
	    System.out.println(driver.findElement(By.id("j_idt88:j_idt98")).getSize());
	    
	    WebElement t1=driver.findElement(By.id("j_idt88:j_idt100"));
	   String c1= t1.getCssValue("color");
	   System.out.println(c1);
	   //a1.moveToElement(t1).build().perform();
	   a1.clickAndHold(t1).build().perform();
	   String c2= t1.getCssValue("color");
	   System.out.println(c2);
	   if(c1.equals(c2)) {
		   System.out.println("color changed");
	   }else {
		   System.out.println("color not changed");
	   }
	   
	  List<WebElement> l1= driver.findElements(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[4]/button[1]/span"));
	  int size=l1.size();
	  System.out.println("total button is "+ size);
	}
	@Test
	public void closebrowser() {
		driver.quit();
	}

}
