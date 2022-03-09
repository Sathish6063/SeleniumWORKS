package seleniumWorksheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saskl\\eclipse-workspace\\SeleniumWORK\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		driver.get("http://www.greenstechnologys.com/");

		String text=driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'][1]")).getText();
		System.out.println(text);


		driver.navigate().to("http://www.greenstechnologys.com/selenium-course-content.html");
		String para=driver.findElement(By.xpath("//p[@style='text-align:justify;'][1]")).getText();
		System.out.println(para);

	}

}
