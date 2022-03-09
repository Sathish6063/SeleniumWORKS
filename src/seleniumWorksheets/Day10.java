package seleniumWorksheets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromerdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		driver.get("https://www.snapdeal.com/");

		driver.findElement(By.id("inputValEnter")).sendKeys("iphone");
		Actions enter= new Actions(driver);
		enter.sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@pogid='664245225623'][1]")).click();

		Set<String> windowshandles=driver.getWindowHandles();
		Iterator<String> newwidow = windowshandles.iterator();
		String second = newwidow.next();
		driver.switchTo().window(second);

		driver.findElement(By.id("pincode-check")).sendKeys("600118");

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone X");
		enter.sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Apple iPhone 11 (128GB) - White")).click();

		Set<String> sk = driver.getWindowHandles();
		Iterator<String> ks = sk.iterator();
		String old = ks.next();
		String seconds = ks.next();
		driver.switchTo().window(old);
		driver.switchTo().window(seconds);

		Thread.sleep(2000);

		driver.findElement(By.id("attach-sidesheet-checkout-button")).click();

		driver.navigate().to("https://www.homedepot.com/");

		Thread.sleep(2000);

		driver.findElement(By.id("headerSearch")).sendKeys("ceiling fan");
		enter.sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='bttn__content'][1]")).click();








		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();



	}

}
