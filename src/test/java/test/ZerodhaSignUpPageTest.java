package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSignUpPage;
import utility.Screenshot;

public class ZerodhaSignUpPageTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.openBrowser();		
	}
	@AfterMethod
	public void screenShot() throws IOException, InterruptedException {
		driver.close();
	}
	@Test
	public void signupZerodha() {
		ZerodhaSignUpPage zerodhasignuppagetest=new ZerodhaSignUpPage(driver);
		zerodhasignuppagetest.clickOnsignupPage();
		zerodhasignuppagetest.switchFocus(driver);
		}

}
