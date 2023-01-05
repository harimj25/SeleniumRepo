package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assigments4service {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev110326.service-now.com/");
		driver.switchTo().frame("gsft_main");
		WebElement name = driver.findElement(By.id("user_name"));
		
		name.sendKeys("admin");
		WebElement name1 = driver.findElement(By.id("user_password"));
		name1.sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
	}

}
