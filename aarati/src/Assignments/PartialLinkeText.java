package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkeText {

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Jewelry"));
			System.out.println("Element 1 Identified");
			
			driver.get("https://www.google.com/");
			driver.findElement(By.partialLinkText("Image"));
			System.out.println("Element 2 Identified");
			
			driver.get("https://www.zomato.com/");
			driver.findElement(By.partialLinkText("Investor"));
			System.out.println("Element 3 Identified");
			
			driver.get("https://www.eatclub.com/");
			driver.findElement(By.partialLinkText("Get More"));
			System.out.println("Element 4 Identified");
			
			driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
			driver.findElement(By.partialLinkText("Try for "));
			System.out.println("Element 5 Identified");
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.partialLinkText("Forgotten"));
			System.out.println("Element 6 Identified");
			
			driver.get("https://www.netflix.com/in/");
			driver.findElement(By.partialLinkText("Sign"));
			System.out.println("Element 7 Identified");
			
			driver.get("https://www.snapchat.com//");
			driver.findElement(By.partialLinkText("Snapchat"));
			System.out.println("Element 8 Identified");
			
			driver.get("https://www.ajio.com/");
			driver.findElement(By.partialLinkText("KITCHEN"));
			System.out.println("Element 9 Identified");
			
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.partialLinkText("Forgot"));
			System.out.println("Element 10 identified");
			
			
			
			driver.close();
		}


	}


