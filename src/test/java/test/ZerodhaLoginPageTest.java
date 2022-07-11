package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLOginPage;
import utility.Screenshot;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void method() {
		driver=Browser.openBrowser();
		
	}
	@AfterMethod
	public void takeScreenShot() throws IOException, InterruptedException  {
		driver.close();
	}
	@Test(priority=3)
	public void loginToZerodha() throws InterruptedException {
		ZerodhaLOginPage zerodhaloginpage=new ZerodhaLOginPage(driver);
		zerodhaloginpage.enterUserid();
		zerodhaloginpage.enterPassword();
		zerodhaloginpage.clickOnLogin();
		zerodhaloginpage.enterPin();
		zerodhaloginpage.clickOnContinue();
		
	}
	@Test(priority=1)
	public void createAccount() {
		ZerodhaLOginPage zerodhaloginpage=new ZerodhaLOginPage(driver);
		zerodhaloginpage.clickOnSignup();
		}
	@Test(priority=2)
	public void forgot() {
		ZerodhaLOginPage zerodhaloginpage=new ZerodhaLOginPage(driver);
	    zerodhaloginpage.clickOnForgot();    
	}
	@Test(enabled=false)
	public void forgotPin() {
		ZerodhaLOginPage zerodhaloginpage=new ZerodhaLOginPage(driver);
		zerodhaloginpage.clickOnForgotPin();
	}

}
