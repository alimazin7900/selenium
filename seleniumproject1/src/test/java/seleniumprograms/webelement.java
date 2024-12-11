package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        String title = driver.getTitle();
        System.out.println("the title of page is:"+title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("the URL of the page is :"+currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("the PageSource is :"+ pageSource);
        Thread.sleep(3000);
        driver.close();
	}

}
