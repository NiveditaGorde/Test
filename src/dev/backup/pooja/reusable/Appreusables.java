package dev.backup.pooja.reusable;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Appreusables {

		public Appreusables() {
		
		}
		
		public static void LoginInToTheApplication(WebDriver driver,String username, String password) {
			
			//Locators for Login
			WebElement txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
			WebElement txt_password = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
			WebElement btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));

			txt_username.sendKeys(username);
			txt_password.sendKeys(password);
			btn_submit.click();
		}

	}



