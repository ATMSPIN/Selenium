package samplejava;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyJavaClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(6000);
		
	}
}
