package com.MiniProject.MavenProject1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass_package.Base_class;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends Base_class {

	public static WebDriver driver=getbrowser("Chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver); 

	public static void main(String[] args) {

		driver = getbrowser("chrome");

		url("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		wait1();
		
		clickElement(pom.getInstancehp().getSignin());
		
		wait1();
		
		inputValue(pom.getInstancelogin().getEmail(), "Imran123@gmail.com");
		inputValue(pom.getInstancelogin().getPassword(), "Imran@1995");
		clickElement(pom.getInstancelogin().getSignin_button());

		wait1();
		close();
	}
}
