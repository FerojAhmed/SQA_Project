package bd.com.AutomationPractise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automation extends DriverSetup {
	public static String baseUrl="https://www.pickaboo.com/";

	@Test
	public static void Daraz() throws InterruptedException{
			driver.get(baseUrl);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver .findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
			Thread.sleep(3000);
			
			driver .findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(3000);
			
			driver .findElement(By.xpath("//input[@id='firstname']")).click();
			Thread.sleep(3000);

	}
}