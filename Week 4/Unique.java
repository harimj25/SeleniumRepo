package Week4.day1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unique {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("ms");
		fromstation.sendKeys(Keys.TAB);
		//To Station
		WebElement Tostation = driver.findElement(By.id("txtStationTo"));
		Tostation.clear();
		Tostation.sendKeys("mdu");
		Tostation.sendKeys(Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
	
		Thread.sleep(1000);
	List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		Set<String> trainname = new LinkedHashSet<String>();
		for (int i = 2; i<=allrows.size(); i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		
		}
		if (allrows.size() - 1 == trainname.size()) {
			System.out.println("No duplicates");
		} else {
			System.out.println("Duplicate train names are there");
		}

		
		

	}


	}


