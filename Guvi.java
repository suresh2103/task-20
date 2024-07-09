package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guvi {

	public static void main(String[] args) throws Exception {

		// Chromebrowser is opened using the web driver

		WebDriver driver = new ChromeDriver();

		// Maximize the window

		driver.manage().window().maximize();

		// navigate to the URL

		driver.get("https://www.guvi.in/");

		// Implicit wait for 5sec

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// locating the sign up link and click it

		WebElement signupLink = driver.findElement(By.linkText("Sign up"));

		signupLink.click();

		// locating the name box and sending the keys

		WebElement name = driver.findElement(By.id("name"));

		name.sendKeys("Testuser");

		// locating the email text box and sending the keys

		WebElement emailId = driver.findElement(By.id("email"));

		emailId.sendKeys("sureshkarthik2103@gmail.com");

		// locating the password field

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Test@2103");

		// locating the mobile number field

		WebElement mobileNumber = driver.findElement(By.id("mobileNumber"));

		mobileNumber.sendKeys("9597100650");

		// Location the sign up button and click it

		WebElement signupButton = driver.findElement(By.xpath("//a[@id='signup-btn']"));

		signupButton.click();

		// explicit wait for 5sec

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(signupButton));

		// locating the element skip other details

		WebElement otherDetails = driver.findElement(By.id("laterBtn"));

		otherDetails.click();

		// condition to check the registration is successfully

		if (driver.getTitle().equals("GUVI | Sign Up")) {

			System.out.println("You have successfully registered with guvi");
		}

		else {

			System.out.println("you have not successfully registered with guvi");
		}

		// navigate to the home page

		driver.navigate().back();

		// locating the login icon to login

		WebElement loginIcon = driver.findElement(By.linkText("Login"));

		loginIcon.click();

		// locating the email id field to enter the registered email id

		WebElement emailId_Registered = driver.findElement(By.id("email"));

		emailId_Registered.sendKeys("sureshkarthik2103@gmail.com");

		// locating the password field to enter the registered password

		WebElement password_Registered = driver.findElement(By.id("password"));

		password_Registered.sendKeys("Test@2103");

		// locate the login button and click on it

		WebElement loginButton = driver.findElement(By.xpath("//a[@id='login-btn']"));

		loginButton.click();
		
		Thread.sleep(2000);

		// Condition to check the login

		if (driver.getTitle().equals("GUVI | courses")) {

			System.out.println("Login is successfull");
		}

		else {
			System.out.println("Login is not Successfull");
		}

		// close & quit the browser
		driver.close();

		driver.quit();

	}

}

//Output:

/* You have successfully registered with Guvi
   Login is successfully                      */