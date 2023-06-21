package selinium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeliniumIntroduction {

	public static void main(String[] args) {
		//if you facing ConnectionFailedException use below code chromeOptions to overcome
		//after writing code and Just pass this 'ops' object to ChromeDriver() as argument
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		//System.setproerty() method becomes optional from selinium version 4.6.0 without that line also we can run the code and it will automatically invoked chrome driver
		//because selinium team implemented that in webmanager class which is in selinium package so that internally takes care...
		//but writing below method is good one that optional method is in beta process...
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
