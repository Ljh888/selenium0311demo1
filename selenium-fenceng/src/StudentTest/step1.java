package StudentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/examsys/index.thtml/");
	}

}
