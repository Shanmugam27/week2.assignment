package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Praja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hari");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7708265065");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Facebook@12345");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select drop1 = new Select(day);
		drop1.selectByValue("17");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop2 = new Select(month);
		drop2.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop3 = new Select(year);
		drop3.selectByIndex(10);

	}

}
