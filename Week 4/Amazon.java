package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.amazon.in/");
		
		WebElement phone = driver.findElement(By.id("twotabsearchtextbox"));
		phone.sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.tagName("h2")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindow.get(1));
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		System.out.println(text);
		
		Thread.sleep(1000);
		String text2 = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']")).getText();

		System.out.println("The number of customer rating is " + text2);
		// taking snapshot
		File Source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/amazons.jpg");
		FileUtils.copyFile(Source, target);
		Thread.sleep(1000);

		// adding to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]")).click();
		Thread.sleep(2000);
		String text3 = driver.findElement(By.xpath("(//span[contains(text(),'66,999.00')])[2]")).getText();

		System.out.println(text3.replaceAll("[^1-9,]", ""));
		assert text == text3;
		System.out.println("The amounts are same");

		driver.quit();

	}


}
