package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webDriver.edge.driver","./msegdedriver.exe");
		
		EdgeDriver d = new EdgeDriver();
	}

}
