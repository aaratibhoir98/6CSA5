package Assignments;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserInputBrowser { 
               //multiple browser Launch based on user choice//*******
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser Name: 1:chrome driver, 2:edge browser ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:{
		      WebDriver driver=new ChromeDriver();
		      driver.get("https://www.fb.com");
		 
		break;
		}
		
		case 2:{
		      WebDriver driver=new EdgeDriver();
		      driver.get("https://www.fb.com");
		      break;
		}
		
		}
	}

}


