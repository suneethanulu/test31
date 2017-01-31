package com.testpakage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstClassTest {
public static WebDriver driver;
	@Test
	public  void tc1() throws MalformedURLException {
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN8_1);
		driver=new RemoteWebDriver(new URL("http://192.168.0.13:4444/wd/hub"),cap);
		
		
		//driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin");
		 driver.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		 driver.findElement(By.id("ap_password")).sendKeys("seleniumpassword");
		 driver.findElement(By.id("signInSubmit")).click();	 
		}
	
	@Test
	public void Atc2()
	{		 
	System.out.println("i am from FirstClassTest->Atc2");

	}

		

	

}
