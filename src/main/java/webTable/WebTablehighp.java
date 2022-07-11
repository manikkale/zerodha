package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablehighp {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement>topPrice=driver.findElements(By.xpath("//table//tbody//tr"));
		int column=topPrice.size();
		double maxprice=0;
		for(int i=1;i<=column;i++) {
			WebElement currentTop=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentTop.getText();
			double d=Double.parseDouble(price);
			if(d>maxprice) {
				maxprice=d;
			}
		}
		System.out.println(maxprice);
	}

}
