package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftapsedit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[31]")).sendKeys("gayathri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("16398")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("companyName")).sendKeys("KG1");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();

	}

}
