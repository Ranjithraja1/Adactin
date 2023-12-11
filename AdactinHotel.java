package AdactinProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sample.Action;

public class AdactinHotel {

	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		//WebDriverManager.ChromeDriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\ProjectNov11\\src");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		user.sendKeys("RanjithRaja123");
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("Apple@678");
		WebElement login = driver.findElement(By.xpath("//input[@class=\"login_button\"]"));
		login.click();

		WebElement loc = driver.findElement(By.xpath("//select[@id=\"location\"]"));
		Select s = new Select(loc);
		s.selectByVisibleText("New York");

		WebElement hotel = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		Select s3 = new Select(room);
		s3.selectByIndex(3);

		WebElement roomno = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select s4 = new Select(roomno);
		s4.selectByIndex(4);

		WebElement datepic = driver.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
		datepic.sendKeys("28/11/2023");

		WebElement datepicout = driver.findElement(By.xpath("//input[@name=\"datepick_out\"]"));
		datepicout.sendKeys("05/12/2023");

		WebElement adult = driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		Select s5 = new Select(adult);
		s5.selectByValue("4");

		WebElement child = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
		Select s6 = new Select(child);
		s6.selectByValue("2");

		WebElement search = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		search.click();

		WebElement radio = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]"));
		radio.click();

		WebElement cont = driver.findElement(By.xpath("//input[@name=\"continue\"]"));
		cont.click();

		WebElement fname = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
		fname.sendKeys("Ranjith");

		WebElement lname = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
		lname.sendKeys("Raja");

		WebElement add = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
		add.sendKeys("Kumbakonam");

		WebElement credit = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		credit.sendKeys("5610591081018250");

		WebElement cctype = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
		Select s7 = new Select(cctype);
		s7.selectByValue("AMEX");

		WebElement ccexpm = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		Select s8 = new Select(ccexpm);
		s8.selectByVisibleText("January");

		WebElement ccexpy = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		Select s9 = new Select(ccexpy);
		s9.selectByVisibleText("2025");

		WebElement cvv = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
		cvv.sendKeys("0234");

		WebElement book = driver.findElement(By.xpath("//input[@name=\"book_now\"]"));
		book.click();
		Thread.sleep(5000);
		WebElement book2 = driver.findElement(By.id("my_itinerary"));
		book2.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\screenshot\\Adactin.png");
		FileUtils.copyFile(src, des);

	}
	
}
