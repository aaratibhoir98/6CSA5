package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.tagName("a"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.tagName("img"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://www.netflix.com");
		driver.findElement(By.tagName("input"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://www.eatclub.com");
		driver.findElement(By.tagName("div"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.swiggy.com");
		driver.findElement(By.tagName("h1"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.tagName("input"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.google.com");
		driver.findElement(By.tagName("div"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.meesho.com");
		driver.findElement(By.tagName("input"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.whatsapp.com");
		driver.findElement(By.tagName("div"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.zomato.com");
		driver.findElement(By.tagName("input"));
		System.out.println("Element 10 Identified");
		
		
	}
	
}
