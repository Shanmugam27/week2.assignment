package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		// Find where am supposed to go without clicking me?
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href"));
		//navigate to home page
		driver.navigate().to("http://leafground.com/pages/Link.html");
		// Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		//navigate to home page
		driver.navigate().to("http://leafground.com/pages/Link.html");

	}

}
