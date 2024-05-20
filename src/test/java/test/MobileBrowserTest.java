package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest{

	
	@Test
	public void browserTest() throws InterruptedException {
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle()); 
//		driver.findElement(By.name("q")).sendKeys("Amazon");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.cssSelector(".nav-link[routerlink='/products']")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		String text = driver.findElement(By.cssSelector("a[href*='/products/3']")).getText();
		Assert.assertEquals(text, "Devops");
		
		Thread.sleep(3000);
	}
	
	
}
