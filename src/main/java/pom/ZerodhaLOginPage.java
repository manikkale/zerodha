package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLOginPage {
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='userid']")private WebElement userId;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement logIn;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	@FindBy (xpath="//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot 2FA?']")private WebElement forgotpin;
	
	public ZerodhaLOginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserid() throws InterruptedException {
		userId.sendKeys("QS3473");
	}
	public void enterPassword() {
		password.sendKeys("mANIK@1994");
	}
    public void clickOnLogin() {
    	logIn.click();
    }
    public void clickOnForgot() {
    	forgot.click();
    }
    public void clickOnSignup() {
    	signUp.click();
    }
    public void enterPin() throws InterruptedException {
    	Thread.sleep(3000);
    	pin.sendKeys("221194");
    }
    public void clickOnContinue() {
    	submit.click();
    }
    public void clickOnForgotPin() {
    	forgotpin.click();
    }
   
}
