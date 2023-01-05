package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frameassignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement frames = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("selenium");
		WebElement frames2 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frames2);
		driver.findElement(By.id("a")).click();
		
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Thread.sleep(1000);
		Select name = new Select(dropdown);
		name.selectByVisibleText("BabyCat");
		
	
		
	}


}
