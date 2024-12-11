package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dimension {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    org.openqa.selenium.Dimension dimen=driver.findElement(By.name("email")).getSize();
    System.out.println(" Height "+dimen.height );
    System.out.println("Width "+dimen.width  );
    Thread.sleep(3000);
    driver.close();    
	}

}
