package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://terna.qualcampus.com/Account/LogOn");
		driver.findElement(By.name("UserName"));
		System.out.println("Element 1 Identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q"));
		System.out.println("Element 2 Identified");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("pass"));
		System.out.println("Element 3 Identified");
		
		driver.get("https://github.com/");
		driver.findElement(By.name("user_email"));
		System.out.println("Element 4 Identified");
		
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.name("viewport"));
		System.out.println("Element 5 Identified");
		
		driver.get("https://trainings.internshala.com/?utm_source=Google-Search&utm_campaign=CT-Search-Brand-Oct22&utm_adgroup=Brand&utm_locationinterest=&utm_searchkeyword=internshala&utm_keywordid=kwd-296575527534&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6crfdhH9-RuIag4OZ6Ss4S-iFA7geJ7O18xBf1eouunH6LUsmYqbLcaAi2LEALw_wcB");
		driver.findElement(By.name("twitter:card"));
		System.out.println("Element 6 Identified");
		
		driver.get("https://www.coursera.org/?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF__arte&utm_content=B2C&campaignid=18216928764&adgroupid=141296025832&device=c&keyword=coursera%20login&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=619458216887&hide_mobile_promo&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6etIWG1pmHOTeyTXWoZKJ4MuNKARSWJp00NAlQ2lxjtJMJrwUrRaH0aAj-IEALw_wcB");
		driver.findElement(By.name("theme-color"));
		System.out.println("Element 7 Identified");
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.name("description"));
		System.out.println("Element 8 Identified");
		
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.name("robots"));
		System.out.println("Element 9 Identified");
		
		driver.get("https://www.foodpanda.com/");
		driver.findElement(By.name("s"));
		System.out.println(" Element 10 dentified");
		
		
		driver.quit();
		
	}
	
}
