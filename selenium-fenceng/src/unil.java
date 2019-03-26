import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unil {
	static WebDriver driver;
	public void aa(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tool\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
	}

}
