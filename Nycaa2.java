package AdactinProject;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

public class Nycaa2 {

public static void main(String[] args) throws AWTException {
	
		
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.nykaa.com");
			
			driver.manage().window().maximize();
			
			WebElement appliance = driver.findElement(By.xpath("//a[text()='appliances']"));
			Actions a =new Actions(driver);
			Robot r =new Robot();
			a.moveToElement(appliance).build().perform();
			WebElement hairdryers = driver.findElement(By.xpath("//a[text()=' Hair Dryers']"));
			a.moveToElement(hairdryers).build().perform();
			a.contextClick().build().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Set<String> handles = driver.getWindowHandles();
			for (String str : handles) {
				driver.switchTo().window(str);
			}
			
			System.out.println("Ranjith 123");
			System.out.println("Demo12");
			
			
			
		}
	}


