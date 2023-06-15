package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aarati/Desktop/html/login.html");
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.clear();
		textBox.sendKeys("hello");

	}

}
