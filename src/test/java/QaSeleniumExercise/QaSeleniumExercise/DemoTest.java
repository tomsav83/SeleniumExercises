package QaSeleniumExercise.QaSeleniumExercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoTest {
	
	private RemoteWebDriver driver;
	
	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
		
	}
	
	
	@Test
	void demoTest() {
		this.driver.get("http://automationpractice.com/index.php");
		WebElement search = this.driver.findElement(By.cssSelector("#search_query_top"));
		search.sendKeys("Dress");
		search.sendKeys(Keys.ENTER);
		
		this.driver.findElement(By.cssSelector("#searchbox > button")).click();
		
		
	}
	
	@AfterEach
	void tearDown() {
//		this.driver.close();
		
	}

}
