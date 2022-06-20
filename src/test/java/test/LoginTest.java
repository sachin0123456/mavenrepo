package test;

import org.testng.annotations.Test;
public class LoginTest extends BaseTestClass {
 @Test
 public void loginpage1() 
 {
	 page.loginpage1 lp=new page.loginpage1(driver);
 lp.Credential();
 lp.loginclick();
 }
}
