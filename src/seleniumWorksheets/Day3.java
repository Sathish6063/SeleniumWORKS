package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		WebElement contactus=driver.findElement(By.linkText("CONTACT US"));
		contactus.click();
		Thread.sleep(2000);
		driver.findElement(By.id("InputName")).sendKeys("sathish");
		driver.findElement(By.id("InputEmail1")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("InputSubject")).sendKeys("9884765443");

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(2000);

		driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.findElement(By.xpath("//a[@data-target='#interview8']")).click();	


		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobileNoInp'][1]")).sendKeys("87947638393");

		Thread.sleep(2000);
		driver.navigate().to("https://www.cleartrip.com/trains");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@idfield='from_station1']")).sendKeys("chennai");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("delhi");
		Thread.sleep(2000);
		WebElement trainclass= driver.findElement(By.id("trainClass"));
		Select select= new Select(trainclass);
		select.selectByIndex(5);
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='dpt_date']")).sendKeys("02/04/2022");

		Thread.sleep(2000);
		WebElement trainadults = driver.findElement(By.id("train_adults"));
		Select adults= new Select(trainadults);
		adults.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();

		driver.navigate().to("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Java For WebDriver")).click();

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement loginflipkart = driver.findElement(By.linkText("Login"));
		Actions hover= new Actions(driver);
		hover.moveToElement(loginflipkart);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("helllo");

		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9941838906");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");


		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hellohellohello");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("hellohellohello1234");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("hellohellohello1234");





























	}

}
