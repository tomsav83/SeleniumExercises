package QaSeleniumExercise.QaSeleniumExercise;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTest {
	
	private RemoteWebDriver driver;
	
	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // forces execution of test stages to wait for 20 seconds 
		
	}
	
	
	
	@Test
	void demoTest() {
		this.driver.get("http://automationpractice.com/index.php");
		WebElement search = this.driver.findElement(By.cssSelector("#search_query_top")); // selects search input field
		search.sendKeys("Dress"); // inputs "Dress" into search bar
		search.sendKeys(Keys.ENTER); // automates pressing enter
		
		this.driver.findElement(By.cssSelector("#searchbox > button")).click(); // targets searchbox click button and executes 
		
		
		this.driver.findElement(By.cssSelector
				("#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link")).click(); // selects the product and executes 
		
		this.driver.findElement(By.cssSelector
				("#add_to_cart > button")).click(); // selects add to cart button and executes
		
		this.driver.findElement(By.cssSelector
				("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")).click(); // selects proceed to checkout and executes - onto summary page
		
		this.driver.findElement(By.cssSelector
				("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click(); // selects proceed to checkout and executes - onto sign in page
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#SubmitLogin")));
		
		WebElement email = this.driver.findElement(By.cssSelector("#email")); // selects email input field
		email.sendKeys("tom@me.com"); // inputs "tom@me.com" into email field
		
		WebElement password = this.driver.findElement(By.cssSelector("#passwd")); // selects password input field
		password.sendKeys("password"); // inputs "password" into email field
		
		this.driver.findElement(By.cssSelector
				("#SubmitLogin")).click(); // targets the sign in button and executes - onto address page
		
		
		this.driver.findElement(By.cssSelector
				("#center_column > form > p > button")).click();
		
		this.driver.findElement(By.cssSelector
				("#cgv")).click(); // checks the T&C's checkbox
		
		this.driver.findElement(By.cssSelector
				("#form > p > button")).click(); // targets the proceed to checkout and executes
		
		this.driver.findElement(By.cssSelector
				("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click(); // selects and executes the "Pay by bank wire" element - onto "ORDER SUMMARY - BANK WIRE PAYMENT"
		
		this.driver.findElement(By.cssSelector
				("#cart_navigation > button")).click(); // selects the "confirm order" and executes - completes order
		
		
	}
	
	@AfterEach
	void tearDown() {
//		this.driver.close();
		
	}

}
