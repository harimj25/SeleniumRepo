package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");
       //to choose automation tool
		WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
	      Select name = new Select(dropdown);
	      name.selectByVisibleText("Selenium");
	      
	      //to choose country
	    driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	    driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//following::li[2]")).click();
    //Choose the Course
	    driver.findElement(By.xpath("//h5[text()='Choose the Course']/following::div/button")).click();
	    driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	   //choose the language
	 driver.findElement(By.xpath("//div[@id='j_idt87:lang']")).click();
	driver.findElement(By.xpath("//li[text()='Tamil']")).click();
	///choose the respective language
	driver.findElement(By.xpath("//h5[contains(text(),'irrespective')]/following-sibling::div")).click();
	driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper'])[4]//li[2]")).click();
	   
	   
	   
	     
	}

}
