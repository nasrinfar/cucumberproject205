package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BestBuyStepDefinitions {

	static WebDriver driver;
	String Browsername ="Chrome";


	@Given("User lunch chrome browser")
	public void user_lunch_chrome_browser() {

		if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Suborna\\eclipse-workspace2\\cucumberproject205\\src\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}else if (Browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Suborna\\eclipse-workspace2\\cucumberproject205\\src\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}else if (Browsername.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Suborna\\eclipse-workspace2\\cucumberproject205\\src\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}else {System.out.println("RESULT: BROWSER NOT FPOND");

		}
		driver.manage().window().maximize();
	}


	@Then("User open Best Buy url")
	public void user_open_best_buy_url() {
		driver.get("https://www.bestbuy.com/");
	}

	@Then("Page title should be displayed")
	public void page_title_should_be_displayed() {
		System.out.println(driver.getTitle());
	}

	
	@Then("User click on Singin")
	public void user_click_on_singin() {
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	}

	@Then("User enter valid Email and password")
	public void user_enter_valid_email_and_password() { 
		driver.findElement(By.xpath("//input[@ id='fld-e']")).sendKeys("subornac91@gmail.com");
		driver.findElement(By.xpath("//input[@ id='fld-p1']")).sendKeys("Best buy@123");
	}


	@Then("User click on Sign in button")
	public void user_click_on_sign_in_button() {
		driver.findElement(By.xpath("//button[@ type='submit']")).click();   
	}
}
	