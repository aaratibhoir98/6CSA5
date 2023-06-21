package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Aarati");
		driver.findElement(By.name("lastname")).sendKeys("Sambare");
		driver.findElement(By.name("reg_email__")).sendKeys("aarati98sambare@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aarati98sambare@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		 
	}

}
