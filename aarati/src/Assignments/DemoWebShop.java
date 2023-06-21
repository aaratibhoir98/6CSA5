package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElementMethod.SendKeys;

public class DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aarati");
		driver.findElement(By.id("LastName")).sendKeys("sambare");
		driver.findElement(By.id("Email")).sendKeys("Aarati98sambare@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}

}
