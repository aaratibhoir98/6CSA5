package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.meesho.com/");
		driver.findElement(By.id("__next"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.swiggy.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.zomato.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.eatclub.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("email"));
		System.out.println("Element 10 Identified");
		driver.close();

	}

}
