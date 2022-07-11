package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLowp {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> current=driver.findElements(By.xpath("//table//tbody//tr"));
		double max=0;
		int column=current.size();
		for(int i=1;i<=column;i++) {
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d>max) {
				max=d;
			}
		}
		System.out.println(max);
		
		for(int j=1;j<=column;j++) {
			WebElement currentLow=driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[4]"));
			String rate=currentLow.getText();
			double d=Double.parseDouble(rate);
			if(d<max) {
				max=d;
			}
		}
		System.out.println(max);
	}
}