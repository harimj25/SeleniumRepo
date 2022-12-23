package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement enter = driver.findElement(By.id("twotabsearchtextbox"));
		enter.sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> allbookprice = driver.findElements(By.className("a-price-whole"));
	     
		 List<Integer> allprices = new ArrayList<Integer>();
		 for (int i = 0; i < allbookprice.size(); i++) {
	    	if (allbookprice.get(i).getText()!="") {
	    		String price = allbookprice.get(i).getText().replaceAll(",", "");	
	    		allprices.add(Integer.parseInt(price));
	    	}
	    
		}
		Collections.sort(allprices);
		System.out.println(allprices.get(0));
		}

	

}
