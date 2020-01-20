package checking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chck {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zero\\eclipse-workspace\\checking\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("greens");
		d.findElement(By.id("pass")).sendKeys("dfghjkl");
		System.out.println("visagan");
		d.close();
	
	
	}

}
