package Cookeis;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.get("https://www.fb.com");
		driver.manage().deleteAllCookies();
		
		

	}


}
