package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("harim522@gmail.com");

		WebElement password  = driver.findElement(By.id("password"));
		password.sendKeys("Hari@123");

		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}

}
