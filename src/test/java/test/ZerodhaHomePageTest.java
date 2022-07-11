package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaHomepage;
import pom.ZerodhaLOginPage;
import utility.BaseClass;
import utility.Screenshot;

public class ZerodhaHomePageTest extends BaseClass {
	
	@BeforeMethod
	public void login() throws InterruptedException {
		driver=Browser.openBrowser();
		ZerodhaLOginPage zerodhahomepagetest=new ZerodhaLOginPage(driver);
		zerodhahomepagetest.enterUserid();
		zerodhahomepagetest.enterPassword();
		zerodhahomepagetest.clickOnContinue();
		zerodhahomepagetest.enterPin();
		zerodhahomepagetest.clickOnContinue();
	}
	@AfterMethod
	public void close() {
	 driver.close();
	}
	@Test(priority=1)
	public void buyStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.clickOnBuy(driver);	
		boolean status=zerodhahomepagetest.isImageDisplayed();
		Assert.assertTrue(status);
	}
	@Test(priority=2)
	public void clickOnOrders() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.clickOnOrders();
		boolean status=zerodhahomepagetest.isOrdersDisplayed();
		Assert.assertTrue(status);
	}
	@Test(priority=3)
	public void clickOnHoldings() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.clickOnHoldings();
		boolean status=zerodhahomepagetest.isHoldingsDisplayed();
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(status);
	}
	@Test(priority=4)
	public void clickOnFunds() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.clickOnFunds();
		boolean status=zerodhahomepagetest.isFundsDisplayed();
	}
	@Test(priority=5)
	public void clickOnUser() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.clickOnUser();
		boolean status=zerodhahomepagetest.isUserDisplayed();
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(status);
	}
	@Test(priority=6)
	public void sellStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.sellStock(driver);
		boolean status=zerodhahomepagetest.isSellDisplayed();
		Assert.assertTrue(status);
	}
	@Test(priority=7)
	public void chartStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.chartStock(driver);
		//boolean status=zerodhahomepagetest.isDisplayedChart();
			//Assert.assertTrue(status);
	}
	@Test(priority=8)
	public void marketDepthStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.marketDepthStock(driver);
		boolean status=zerodhahomepagetest.isDisplaydMarketDepth();
		Assert.assertTrue(status);
	}
	@Test(priority=9)
	public void addStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.addStock(driver);
		
	}
	@Test(priority=11,dependsOnMethods={"clickOnMore"})
	public void deleteStock() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.deleteStock(driver);		
	}
	@Test(priority=10,dependsOnMethods={"addStock"})
	public void clickOnMore() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.moreOption(driver);
	}
	@Test(priority=11)
	public void buyFromSearchList() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.buyShareFromWatchList(driver);
	}
	@Test(priority=12)
	public void buyStockFromSearchList() {
		ZerodhaHomepage zerodhahomepagetest=new ZerodhaHomepage(driver);		
		zerodhahomepagetest.buyShareFromSearchList(driver);
		//boolean status=zerodhahomepagetest.isSearchListBuyDisplayed();
		//Assert.assertTrue(status);
	
	}

}
