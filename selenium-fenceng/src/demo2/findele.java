package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findele extends unil{
static WebElement a;
static WebElement b;
	public static void b() {
		// TODO Auto-generated method stub
		
		a=driver.findElement(By.xpath("/html/body/div[10]/div/div[1]/form/div[1]/h3"));
		b=driver.findElement(By.xpath("/html/body/div[10]/div/div[1]/form/div[1]/div[2]/ul/li[5]"));
	}

}
