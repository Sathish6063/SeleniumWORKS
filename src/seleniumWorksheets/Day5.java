package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {

	public static void main(String[] args) throws Throwable {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromerdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		
		

		driver.get("https://www.amazon.in/");

		driver.findElement(By.className("hm-icon-label")).click();
	
	driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_13']")).click();
	
		driver.findElement(By.linkText("Power Banks")).click();
		
		
		
		driver.navigate().to("https://www.google.co.in/webhp");
		driver.findElement(By.xpath("//a[@role='button'][1]")).click();
		Thread.sleep(2000);
		WebElement hover1=driver.findElement(By.xpath("//span[@contains(text()='Gmail']"));
		hover1.click();
		Actions cat= new Actions(driver);
		cat.moveToElement(hover1);

	}

}
