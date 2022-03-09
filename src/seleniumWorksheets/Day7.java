package seleniumWorksheets;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromerdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");


		TakesScreenshot greens= (TakesScreenshot) driver;
		File navscr=greens.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\snaps\\greens.png");
		FileUtils.copyFile(navscr, dest);


		driver.navigate().to("http://toolsqa.com/") ;
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='modal__close'][1]")).click();

		WebElement view = driver.findElement(By.linkText("Call us:"));

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("argument[0].scrollIntoView();", view);

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement flipkart=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		flipkart.sendKeys("iphone 12 pro max");

		Actions enter=new Actions(driver);
		enter.sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
		Thread.sleep(2000);
		WebElement cart= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		cart.click();





	};

}

