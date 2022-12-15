package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftapscreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Harini");
		driver.findElement(By.id("lastNameField")).sendKeys("B");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hari");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Prasad");
		driver.findElement(By.name("departmentName")).sendKeys("Ece");
		driver.findElement(By.name("description")).sendKeys("I love Selenium");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("harimj522@gmail.com");
		
		
		//DropDown
		
		WebElement Drop = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select DropState=new Select(Drop);
		DropState.selectByVisibleText("Texas");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("description")).sendKeys(" ");
		driver.findElement(By.xpath("(//textarea[@name='importantNote'])[1]")).sendKeys("Difficult task");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
