package samplepracticetest;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SbiTestSample {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		 driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("samsung s22");
		 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		 driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		 
		driver.navigate().forward();
		 driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		 
		 
		 
		 
		Thread.sleep(3000);
		
	}

}
