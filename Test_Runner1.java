package com.MiniProject.MavenProject1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import com.baseclass_package.Base_class1;
import com.pom.Book_Hotel1;
import com.pom.Itinerary1;
import com.pom.Login_Page1;
import com.pom.Search_Hotel1;
import com.pom.Search_Hotel2;
import com.sdp.Page_Object_Manager1;

public class Test_Runner1 extends Base_class1{
	
	public static WebDriver driver=getbrowser("chrome");
	public static Page_Object_Manager1 pom1 = new Page_Object_Manager1(driver);
	
	public static void main(String[] args) throws Throwable {
		
		url("https://adactinhotelapp.com/index.php");
		wait1();	
		
		inputvalues(pom1.getInstancelp1().getUsername(), "ImranToretto");		
		inputvalues(pom1.getInstancelp1().getPassword(), "Imran@1995");		
		clickoperation(pom1.getInstancelp1().getLogin());
		wait1();
		
		select(pom1.getInstancesh1().getLocation(), 1);
		select (pom1.getInstancesh1().getHotels(), 2);
		select(pom1.getInstancesh1().getRoom_type(), 4);
		select(pom1.getInstancesh1().getRoom_nos(), 1);
		thread(1000);
		
		clickoperation(pom1.getInstancesh1().getCheckindate());
		cleararea(pom1.getInstancesh1().getCheckindate());
		inputvalues(pom1.getInstancesh1().getCheckindate(), "22/11/2021");
		thread(1000);
		
		clickoperation(pom1.getInstancesh1().getCheckoutdate());
		cleararea(pom1.getInstancesh1().getCheckoutdate());
		inputvalues(pom1.getInstancesh1().getCheckoutdate(), "23/11/2021");
		thread(1000);
		
		select(pom1.getInstancesh1().getAdult_room(), 2);
		thread(1000);	
		select(pom1.getInstancesh1().getChild_room(), 1);
		thread(1000);
		clickoperation(pom1.getInstancesh1().getSubmit());
		wait1();

	    clickoperation(pom1.getInstancesh2().getRadio1());
		thread(1000);
		clickoperation(pom1.getInstancesh2().getContinue1());
		wait1();

		inputvalues(pom1.getInstancebh1().getFname(), "Mohamed");		
		inputvalues(pom1.getInstancebh1().getLname(), "Imran");		
		inputvalues(pom1.getInstancebh1().getAddress(), "1st Street,India");		
		inputvalues(pom1.getInstancebh1().getCcnum(), "1234567891234567");
		select(pom1.getInstancebh1().getCctype(), 2);
		select(pom1.getInstancebh1().getExpmon(), 5);
		select(pom1.getInstancebh1().getExpyear(), 12);
		inputvalues(pom1.getInstancebh1().getCcvv(), "321");		
		clickoperation(pom1.getInstancebh1().getBooknow());
		wait1();

		JavaScript(pom1.getInstancei1().getIter());
		thread(1000);
		clickoperation(pom1.getInstancei1().getIter());
		wait1();
		thread(2000);

		screenshot();

	}

	
	}


