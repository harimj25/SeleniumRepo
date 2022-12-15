package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.get("http://www.leaftaps.com/opentaps");
driver.manage().window().maximize();

WebElement username = driver.findElement(By.xpath("//input [@id='username']"));
username.sendKeys("DemoSalesManager");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");
WebElement login =driver.findElement(By.className("decorativeSubmit"));
login.click();
driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

driver.findElement(By.xpath("//a[contains(@style,'black')]")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Lead')])[3]")).click();

	}

}
