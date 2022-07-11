package pom;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZerodhaSignUpPage {
	
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
    @FindBy(xpath="//input[@id='user_mobile']")private WebElement mobile;
    @FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement submit;
    @FindBy(xpath="//input[@label='Mobile OTP']")private WebElement confirmOTP;
    @FindBy(xpath="//button[@type='submit']")private WebElement next;
    @FindBy(xpath="//input[@placeholder='Name']")private WebElement name;
    @FindBy(xpath="//input[@placeholder=E-mail")private WebElement email;
    @FindBy(xpath="//input[@placeholder='E-mail OTP']")private WebElement emailOTP;
    @FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
    @FindBy(xpath="/html/body/div/div[2]/main/div/div/div/div/div/div/div/form/div/div[2]/div/div/select")private WebElement year;
    @FindBy(xpath="/html/body/div/div[2]/main/div/div/div/div/div/div/div/form/div/div[2]/div/div/select[2]")private WebElement month;
    @FindBy(xpath="/html/body/div/div[2]/main/div/div/div/div/div/div/div/form/div/div[2]/div/div/select[3]")private WebElement day;
    
    public ZerodhaSignUpPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);    	
    }
    public void clickOnsignupPage() {
    	signUp.click();
    }
    public void enterMobileno(String mobileno) {
    	mobile.sendKeys(mobileno);
    }
    public void clickOnSubmit() {
    	submit.click();    	
    }
    public void enterOTPMob(String MobOTP) {
    	confirmOTP.sendKeys(MobOTP);
    }
    public void clickonNext() {
    	next.click();
    }
    public void enterName(String Name) {
    	name.sendKeys(Name);
    }
    public void enterEmail(String Email) {
    	name.sendKeys(Email);
    }
    public void enterEmailOTP(String EmailOTP) {
    	name.sendKeys(EmailOTP);
    }
    public void enterPan(String Pan) {
    	name.sendKeys(Pan);
    }
    public void selectDOB(String Year,String Month,String Day) {
    	Select se=new Select(year);
    	se.selectByVisibleText(Year);
    	Select sel=new Select(month);
    	sel.selectByVisibleText(Month);
    	Select sele=new Select(day);
    	sele.selectByVisibleText(Day);
    }
    public void switchFocus(WebDriver driver) {
       	Set<String>handles=driver.getWindowHandles();
    	Iterator<String>i=handles.iterator();
    	while(i.hasNext()) {
    		String handle=i.next();
    		driver.switchTo().window(handle);
    		String title=driver.getTitle();
    		if(title.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha")) {
    			ZerodhaSignUpPage zerodhasignuppage=new ZerodhaSignUpPage(driver);
    			zerodhasignuppage.enterMobileno("9021599522");
    			zerodhasignuppage.clickonNext();
    			zerodhasignuppage.enterOTPMob("12345");
    			zerodhasignuppage.clickonNext();
    			zerodhasignuppage.enterName("mariyakale");
    			zerodhasignuppage.enterEmail("mariyakale1987@gmail.com");
    			zerodhasignuppage.clickonNext();
    			zerodhasignuppage.enterEmailOTP("12345");    			
    		}
    	}
    }
    
    
}
