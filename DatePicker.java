package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		// Storing the String Variable

		String date = "22";
		String month = "May";

		// Launch the ChromeDriver

		WebDriver driver = new ChromeDriver();

		// Window Maximize

		driver.manage().window().maximize();

		// Navigate to the URL

		driver.get("https://jqueryui.com/datepicker/");

		// Switching to the iframe

		driver.switchTo().frame(0);

		// Select the Date Picker box

		WebElement dateBox = driver.findElement(By.id("datepicker"));

		dateBox.click();

		// While loop to check the variable month not equals the selecting month

		while (!(month.equals(

				// locating January month
				driver.findElement(By.className("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).getText())));
				
		
		driver.close();
		
		driver.quit();

	}

}


// output : 02/05/2024

