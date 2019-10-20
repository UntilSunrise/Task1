package testMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
  @Test
  public void f() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("softserve");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		String nameOfFirstLink = driver.findElement(By.className("LC20lb")).getText();
		Assert.assertEquals(nameOfFirstLink, "SoftServe: Home");
		
		driver.close();
  }
}
