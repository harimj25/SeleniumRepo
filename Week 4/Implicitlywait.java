package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username =driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Testleaf$321");
		
		WebElement LogIn = driver.findElement(By.id("Login"));
		LogIn.click();
		
		driver.findElement(By.className("slds-icon-waffie")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click()
		;

}
}
