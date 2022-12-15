package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentabs");
		 WebElement username =driver.findElement(By.id("username"));
		 username.sendKeys("Democsr");
		 WebElement password =driver.findElement(By.id("password"));
		 password.sendKeys("crmsfa");
		 
		 WebElement login=driver.findElement(By.className("decorativesubmit"));
		 login.click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("create lead")).click();
	}

}
