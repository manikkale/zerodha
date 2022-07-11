package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;
	
	public static WebDriver openBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver(1).exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
	    driver.get("https://kite.zerodha.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	    return driver;
	    
	}

}
