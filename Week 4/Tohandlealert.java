package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tohandlealert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		//to locate a web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[2]")).click();
     
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        String text1 = alert.getText();
       System.out.println(text1);
       Thread.sleep(1000);
       alert.accept();
        
	}

}
