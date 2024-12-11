package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
	    radio1.click();
	    System.out.println("Radio button 1 selected");
	    WebElement radio2=driver.findElement(By.id("vfb-7-2"));
	    radio2.click();
	    System.out.println("Radio button 2 is selected");
	    WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
	    WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
	    
	    checkbox1.click();
	    if (checkbox1.isSelected()) {
	    	System.out.println("check box 1 selected");
	    	
	    }
	    else
	    	System.out.println("check box is not selected");
	    Thread.sleep(3000);
	    driver.close();
	  
	  
	    
		
		

	}

}
