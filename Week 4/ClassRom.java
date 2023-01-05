package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3Schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("Hari");
		alerts.accept();
		
		String text =driver.findElement(By.xpath("//p[@id= 'demo']")).getText();
		System.out.println("Entered text frame:" +text);
	
	}

}
