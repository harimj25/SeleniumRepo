package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(count);
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Number of products displaying in first page:" + brands.size());
		System.out.println("Brands of the products displaying: ");
		for (int i=0;i<brands.size();i++)
		{
			WebElement we=brands.get(i);
			String brandslist=we.getText();
		System.out.print(brandslist + " " + ";");
		}
		List<WebElement> bagnames=driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("\n\n"+"List of bagnames displaying  are:");
		for (int i=0;i<bagnames.size();i++)
		{
			WebElement we=bagnames.get(i);
			String name=we.getText();
			System.out.print("\n"+name + " "+";");
		}
		
	/*for (WebElement webElement : brands) {
			String text = webElement.getText();
			System.out.println(text);
		}*/

		
	}

}
