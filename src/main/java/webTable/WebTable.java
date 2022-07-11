package webTable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> heading=driver.findElements(By.xpath("//table//thead//tr//th"));
		int column=heading.size();
		for(int i=0;i<=column;i++) {
			System.out.println(heading.get(i).getText());
		}
	}

}
