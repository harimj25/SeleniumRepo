package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments3 {
	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://buythevalue.in/");

		
		driver.findElement(By.xpath("//a[@class='product-title']")).click();


		

		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button")).click();
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Receive our latest discount codes')]/following-sibling::div/div")).click();
		
	
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();

		
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("625515");
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();

		
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	


	}


}
