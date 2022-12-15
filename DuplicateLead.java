package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("jeff")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.getTitle());

		if(driver.getTitle().contains("Duplicate")){
			System.out.println("I confirm the title has Duplicate Lead");
			
			} 
			else 
				System.out.println("The title doesnot have word Duplicate Lead");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

	}

}
