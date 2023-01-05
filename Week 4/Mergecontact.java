package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mergecontact {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Demosalesmanager");
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::a")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
	     List<String>listwindow = new ArrayList<String>(windowHandles);
	     driver.switchTo().window(listwindow.get(1));
	    
	   driver.findElement(By.linkText("DemoCustomer")).click();
	  
	   driver.switchTo().window(listwindow.get(0));
	   
	   
	   driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::a[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
	     List<String>listwindow2 = new ArrayList<String>(windowHandles2);
	     driver.switchTo().window(listwindow2.get(1));
	     driver.findElement(By.linkText("dp1a1contact2")).click();
	     driver.switchTo().window(listwindow.get(0));
	     driver.findElement(By.linkText("Merge")).click();
	   
	   driver.switchTo().alert().accept();
	   Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	       
	
	}

}
