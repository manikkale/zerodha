package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class ZerodhaHomepage {
	WebDriver driver;
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="(//span[text()='WIPRO'])[1]")private WebElement wipro;
	@FindBy(xpath="//span[text()='WIPRO']")private WebElement wipro1;
	@FindBy(xpath="(//button[@class='button-blue'])[1]")private WebElement buy;
	
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement listbuy;	
	@FindBy(xpath="//button[@class='button-orange']")private WebElement sell;
	@FindBy(xpath="(//button[@class='button-outline'])[2]")private WebElement marketDepth;
	@FindBy(xpath="(//button[@class='button-outline'])[1]")private WebElement chart;
	@FindBy(xpath="(//button[@class='button-outline'])[3]")private WebElement delete;
	@FindBy(xpath="//button[@class='context-menu-button button-outline']")private WebElement more;
	@FindBy(xpath="//span[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//span[text()='Orders']")private WebElement orders;
	@FindBy(xpath="//span[text()='Holdings']")private WebElement holdings;
	@FindBy(xpath="//span[text()='Positions']")private WebElement positions;
	@FindBy(xpath="//span[text()='Funds']")private WebElement funds;
	@FindBy(xpath="//span[text()='Apps']")private WebElement apps;
	@FindBy(xpath="//span[text()='QS3473']")private WebElement user;
	@FindBy(xpath="//button[text()='Start investing ']")private WebElement startInvesting;
	@FindBy(xpath="//a[@class='button button-blue']")private WebElement activate;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancel;
	@FindBy(xpath="(//span[text()='Orders'])[2]")private WebElement valorders;
	@FindBy(xpath="(//span[text()='Holdings'])[2]")private WebElement valholdings;
	@FindBy(xpath="//button[@class='button-green']")private WebElement valfunds;
	@FindBy(xpath="(//a[@href='/profile'])[2]")private WebElement valuser;
	@FindBy(xpath="(//span[text()='Sell'])[2]")private WebElement valsell;
	@FindBy(xpath="//table[@class='chart-markup-table']")private WebElement valchart;
	@FindBy(xpath="(//input[@icon='search'])[2]")private WebElement valmarketDepth;
	@FindBy(xpath="//span[@class='icon icon-plus']")private WebElement add;
	@FindBy(xpath="//span[@class='icon icon-trash']")private WebElement delete1;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement>shares;
	@FindBy(xpath="//span[@class='symbol']")private List<WebElement>searchList;
	@FindBy(xpath="(//button[@class='button-blue'])[1]")private WebElement searchListBuy;
	
	public ZerodhaHomepage(WebDriver driver) {
		PageFactory.initElements( driver,this);		
	}
	public void clickOnBuy(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(search);
		action.click();
		action.sendKeys("wipro");
		action.build().perform();
		action.moveToElement(wipro);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(buy));
		action.moveToElement(buy);
		action.click();
		action.build().perform();		
	}
	public boolean isImageDisplayed() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(cancel));
		return cancel.isDisplayed();
	}
	public void clickOnOrders() {
		orders.click();
	}
	public boolean isOrdersDisplayed() {
		return valorders.isDisplayed();
	}
	public void clickOnHoldings() {
		holdings.click();
	}
    public boolean isHoldingsDisplayed() {
    	return valholdings.isDisplayed();
    }
    public void clickOnFunds() {
    	funds.click();
    }
	public boolean isFundsDisplayed() {
		return valfunds.isDisplayed();
	}
	public void clickOnUser() {
		user.click();
	}
	public boolean isUserDisplayed() {
		return valuser.isDisplayed();
	}
	public void sellStock(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(search);
		action.click();
		action.sendKeys("wipro");
		action.build().perform();
		action.moveToElement(wipro);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(sell));
		action.moveToElement(sell);
		action.click();
		action.build().perform();		
	}
	public boolean isSellDisplayed() {
		return valsell.isDisplayed();
	}
	public void chartStock(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(search);
		action.click();
		action.sendKeys("wipro");
		action.build().perform();
		action.moveToElement(wipro);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(chart));
		action.moveToElement(chart);
		action.click();
		action.build().perform();	
		
		}
	public boolean isDisplayedChart() {
		return valchart.isDisplayed();	    
	}
	public void marketDepthStock(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(search);
		action.click();
		action.sendKeys("wipro");
		action.build().perform();
		action.moveToElement(wipro);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(marketDepth));
		action.moveToElement(marketDepth);
		action.click();
		action.build().perform();		
	}
	public boolean isDisplaydMarketDepth() {
		return valmarketDepth.isDisplayed();
	}
	public void addStock(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(search);
		action.click();
		action.sendKeys("wipro");
		action.build().perform();
		action.moveToElement(wipro);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(add));
		action.moveToElement(add);
		action.click();
		action.build().perform();		
	}
	public void deleteStock(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",wipro);
		Actions action=new Actions(driver);
		action.moveToElement(wipro1);
		action.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(delete1));
		action.moveToElement(delete1);
		action.perform();
		action.click();
		action.perform();		
	}
	public void moreOption(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",wipro);
		Actions action=new Actions(driver);
		action.moveToElement(wipro1);
		action.perform();
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(3000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(more));
		action.moveToElement(more);
		action.click();
		action.build().perform();
	}
	public void buyShareFromWatchList(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(search));
		for(int i=0;i<shares.size();i++) {
			WebElement share=shares.get(i);
			String stock=share.getText();
			if(stock.equals("INFY")) {
				Actions action=new Actions(driver);
				action.moveToElement(share);
				action.perform();
				listbuy.click();
			}
			}
		
	}
	public void buyShareFromSearchList(WebDriver driver) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
			wait.until(ExpectedConditions.visibilityOf(search));
			search.sendKeys("WIPRO");
			for(int i=1;i<searchList.size();i++) {
				WebElement stock=searchList.get(i);
				String stockName=stock.getText();
				wait.until(ExpectedConditions.visibilityOf(stock));
				if(stockName.equals("WIPRO")) {
					wait.until(ExpectedConditions.visibilityOf(stock));
					Actions action=new Actions(driver);
					action.moveToElement(stock);
					action.perform();
					searchListBuy.click();
				}
			}
		
		
	}
	public boolean isSearchListBuyDisplayed() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(searchListBuy));
		return searchListBuy.isDisplayed();
	}
	}

