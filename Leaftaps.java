package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("DemoSalesManager");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");

WebElement login=driver.findElement(By.className("decorativeSubmit"));
login.click();
	}

}
