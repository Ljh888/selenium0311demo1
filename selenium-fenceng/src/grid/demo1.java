package grid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class demo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub		
		WebDriver driver;
		ChromeOptions options =new ChromeOptions();
		options.addArguments("C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);		
		driver =new RemoteWebDriver(new URL("http://192.168.187.1:5555/wd/hub"),capabilities);
		driver.get("http://www.baidu.com");
	}

}
