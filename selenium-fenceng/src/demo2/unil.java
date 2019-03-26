package demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unil {
	static WebDriver driver;
	public static void a(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tool\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sina.com.cn/");
	}

}
