package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	 public static WebDriver driver;
	 @BeforeSuite
	 public void initbrowser() 
	 {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAYANAND\\OneDrive\\Desktop\\sachin\\chromedriver\\chromedriver.exe");

	 WebDriverManager.chromedriver().setup();
	 
	 driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(5, 
	TimeUnit.SECONDS);
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 @AfterSuite
	 public void afterSuite() 
	 {
	 driver.close();
	 }
	}

