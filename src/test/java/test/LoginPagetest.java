package test;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import page.loginPage;

	public class LoginPagetest {

		WebDriver driver;
		loginPage lp;
		@BeforeTest
		public void initBrowser() throws InterruptedException {
			
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAYANAND\\OneDrive\\Desktop\\sachin\\chromedriver\\chromedriver.exe");
			
			//step-1 Launch browser
		   driver=new ChromeDriver();
			
			//Step-2 Maximize window
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//step-4
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}	
		
		@BeforeClass
		public void initObject() {
			
			lp=new loginPage(driver);
			
		}
		
		@Test (priority=1)
		public void verifyButton() {
			System.out.println(lp.isButtonPresent());
			Assert.assertTrue(lp.isButtonPresent());
		}

		@Test (priority=2)
		public void login() {
			
			lp.login("Admin", "admin123");
			System.out.println(driver.getTitle());
			
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
	}



