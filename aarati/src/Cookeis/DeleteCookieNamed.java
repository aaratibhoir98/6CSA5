package Cookeis;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		Cookie cooky = new Cookie("selenium","4");
		driver.manage().addCookie(cooky);
		driver.manage().deleteCookieNamed("selenium");
		

	}

}
