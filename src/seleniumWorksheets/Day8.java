package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromerdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997%20NOTE:%20Click%20submit%20without%20enter%20the%20user%20id.");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='inputfield ibvt loginData']/following::a[contains(text(),'CONTINUE')]")).click();
		driver.switchTo().alert().accept();

		driver.navigate().to("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		driver.switchTo().alert().accept();

		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='login_button'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Button2']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.navigate().to("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1DP5L']")).click();

		driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.id("DUMMY1"));
		user.sendKeys("36543681");
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.id("user-id-goahead"));
		click.click();
		Thread.sleep(2000);




	}


}
