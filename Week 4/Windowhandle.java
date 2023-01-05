package Week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("FLIGHTS")).click();
        Set<String> windowHandles = driver.getWindowHandles();
     List<String>listwindow = new ArrayList<String>(windowHandles);
     driver.switchTo().window(listwindow.get(1));
     File Source = driver.getScreenshotAs(OutputType.FILE);
     File target=new File("./snaps/irctc.png");
     FileUtils.copyFile(Source,target);

     driver.close();
     driver.switchTo().window(listwindow.get(0));
     System.out.println(driver.getTitle());
     

    
	}

	}


