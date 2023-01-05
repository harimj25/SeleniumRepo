package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException, IOException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
        
        driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
	     WebElement amount = driver.findElement(By.xpath("//input[@value='489']"));
	     amount.clear();
	     driver.findElement(By.xpath("//input[@value='489']")).sendKeys("900");
	     WebElement amount2 = driver.findElement(By.xpath("//input[@value='975']"));
	     amount2.clear();
	     driver.findElement(By.xpath("//input[@value='975']")).sendKeys("1200");
	     driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	   Thread.sleep(1000);
	  
	     WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
	     Actions builder2=new Actions(driver);
	     builder2.moveToElement(shoe).perform();
	     
	     driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	     
	     String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
	     System.out.println(text2);
	     
	     
	     String text3 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
	     System.out.println(text3);
	     Thread.sleep(1000);
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     File target = new File("./snaps/snapdeal.png");
	     FileUtils.copyFile(source, target);
	     driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
	     driver.quit();
	     
	}


}
