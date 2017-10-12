package mavenBuild1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingClass {

	@Test
	
	public void openBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[@id='menu_projects']/a")).click();
		//driver.findElement(By.xpath("//a[@href='webdriver']")).click();
		
		
		
	}
}
