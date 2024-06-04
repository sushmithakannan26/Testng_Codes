	package automationTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateTradeviv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Sushmitha Job Training\\Project Works\\Real Time Project\\TradeViv\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	    driver.get("https://tradeviv.com/");
		driver.manage().window().maximize();
		
		WebDriverWait w1 = new WebDriverWait(driver, 30);
		WebElement user_icon=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='row sign-in my-account-dropdown position-relative'])[1]")));
		//WebElement user_login=driver.findElement(By.xpath("(//*[@class='row sign-in my-account-dropdown position-relative'])[1]"));
		user_icon.click();
		
		WebDriverWait w2 = new WebDriverWait(driver, 30);
		WebElement user_login=w2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='User Login'][1]")));
		//WebElement user_login=driver.findElement(By.xpath("//span[.='User Login'][1]"));
		//WebElement user_login=driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		user_login.click();
		
		driver.findElement(By.id("username")).sendKeys("sushmitha.kannan26@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sushmitha");
		
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.className("woocommerce-form-login__submit btn btn-primary border-0 rounded-0 submit-btn float-none w-100")).click();
		//WebElement login_btn=driver.findElement(By.xpath("//button[@value='Log in']"));
		//login_btn.click();
		
		WebElement login_btn=driver.findElement(By.xpath("//*[@value='Log in']"));	
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", login_btn);
		
		Thread.sleep(1000);
		
		WebDriverWait w3 = new WebDriverWait(driver, 30);
		//WebElement user_icon_aftlogin=w3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='row sign-in my-account-dropdown position-relative'])[1]")));
		WebElement user_icon_aftlogin=w3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page_wrapper > header > div.main-nav.d-lg-block.d-none.py-3 > div > div > div.col-xl-6 > div > div.row.sign-in.my-account-dropdown.position-relative > a")));
		//WebElement user_icon_aftlogin = driver.findElement(By.xpath("(//*[@class='flaticon-user-3 flat-mini mx-auto text-dark'])[1]"));
		//user_icon_aftlogin.click();
        //WebElement user_icon_aftlogin=driver.findElement(By.xpath("(//*[@class='row sign-in my-account-dropdown position-relative'])[2]"));
		user_icon_aftlogin.click();
				
		//WebDriverWait w4 = new WebDriverWait(driver, 30);
		//WebElement logout=w4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='Logout'])[1]")));
		WebElement logout=driver.findElement(By.xpath("(//span[.='Logout'])[1]"));
		logout.click();
		driver.close();
		int loginCount=0;
		loginCount++;
		System.out.println("Logged in and out successfully " + loginCount + " time(s)");
		}
	}