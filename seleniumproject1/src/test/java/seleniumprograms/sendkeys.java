package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("animals");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(3000);
	driver.close();
	

	}

}
