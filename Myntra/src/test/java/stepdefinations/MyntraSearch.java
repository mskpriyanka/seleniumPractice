package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class MyntraSearch {

	
	
	 WebDriver driver=null;
		
	
	

@Given("browser is open")
public void browser_is_open() {

	String projectPath=System.getProperty("user.dir");
	
	System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	
	

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    System.out.println("browser_is_open()");
}

@And("user is on myntra search page")
public void user_is_on_myntra_search_page() {
	 System.out.println("user_is_on_myntra_search_page()");
	 
	 
	 driver.navigate().to("http://www.myntra.com");
}

@When("user enters a text in search box")
public void user_enters_a_text_in_search_box() {
	 System.out.println("user_enters_a_text_in_search_box()");
}

@When("hits enter")
public void hits_enter() {
	 System.out.println("hits_enter() ");
 driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("tops");
}

@Then("user is navigated to serach results")
public void user_is_navigated_to_serach_results() {
    
	System.out.println("user_is_navigated_to_serach_results() ");
	driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys(Keys.ENTER);
}
}
