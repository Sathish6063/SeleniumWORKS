package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("hello");
		Thread.sleep(2000);
		driver.navigate().to("https://www.redbus.in/");
		WebElement from= driver.findElement(By.id("src"));
		from.sendKeys("chennai");
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("Delhi");
		Thread.sleep(2000);

		driver.navigate().to("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("login_username|input"));
		username.sendKeys("123454");
		Thread.sleep(2000);
		WebElement passwordlvb=driver.findElement(By.id("login_password|input"));
		passwordlvb.sendKeys("hello");
		Thread.sleep(2000);

		driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.id("DUMMY1"));
		user.sendKeys("36543681");
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.id("user-id-goahead"));
		click.click();
		Thread.sleep(2000);

		WebElement passwordic=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		passwordic.sendKeys("1234553");
		Thread.sleep(2000);
		driver.navigate().to("https://twitter.com/login");
		Thread.sleep(2000);
		WebElement usernametwt=driver.findElement(By.xpath("//input[@autocomplete='username']"));
		usernametwt.sendKeys("sk612");
		Thread.sleep(2000);

		Actions next= new Actions(driver);
		next.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement passwordtwt=driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		passwordtwt.sendKeys("hello");
		Thread.sleep(2000);


		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

		WebElement search= driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("GreensTechnology");
		Thread.sleep(2000);

		next.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);



		driver.navigate().to("https://www.swiggy.com");
		WebElement location= driver.findElement(By.id("location"));
		location.sendKeys("Chennai");
		Thread.sleep(2000);

		driver.navigate().to("https://www.snapdeal.com/login");
		WebElement usernamesnap= driver.findElement(By.id("userName"));
		Thread.sleep(2000);
		usernamesnap.sendKeys("sathish");
		Thread.sleep(2000);


		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		Thread.sleep(2000);
		WebElement inst=driver.findElement(By.xpath("//input[@name='username']"));
		inst.sendKeys("sathish");
		Thread.sleep(2000);
		WebElement instpass=driver.findElement(By.xpath("//input[@name='password']"));
		instpass.sendKeys("hello");

		


		Thread.sleep(2000);

		driver.navigate().to("http://adactinhotelapp.com/");
		WebElement userhotel= driver.findElement(By.id("username"));
		userhotel.sendKeys("sathishk33");
		Thread.sleep(2000);

		WebElement passs=driver.findElement(By.id("password"));
		
		
		passs.sendKeys("helllo");
		
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);

		WebElement ok=driver.findElement(By.xpath("//button[@type='submit'][1]"));
		ok.click();

		WebElement toirctc=driver.findElement(By.id("destination"));
		toirctc.sendKeys("delhi");
		Thread.sleep(2000);	
		WebElement fromirctc=driver.findElement(By.xpath("//input[@role='searchbox'][1]"));
		fromirctc.sendKeys("chennai");
		

		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		WebElement userid= driver.findElement(By.xpath("//input[@class='form-control text-muted']"));


		userid.sendKeys("39648335");
		Thread.sleep(2000);
	}


}
