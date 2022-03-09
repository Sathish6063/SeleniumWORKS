package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		
		WebElement select=driver.findElement(By.id("dcdrLocation"));
		
		Select pass= new Select(select);
		
		pass.selectByVisibleText("Chennai");
		
		driver.findElement(By.id("givenName")).sendKeys("Sathish");
		
		driver.findElement(By.id("surname")).sendKeys("kumar");
		
		
		
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		
		driver.findElement(By.id("loginId")).sendKeys("sksksk");
		
		driver.findElement(By.id("pwd")).sendKeys("hellosk");
		
		driver.findElement(By.id("confirmPwd")).sendKeys("hellosk");
		
		driver.findElement(By.id("hintAns")).sendKeys("chennai");
		Thread.sleep(2000);
		
		driver.findElement(By.id("dob")).sendKeys("06/12/1989");

		

	}

}
