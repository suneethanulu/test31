package com.testpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondclassTest {
	@Test
	public void tc2()
	{
		System.out.println("i am from MySecondTest->tc2");
		/*WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.linkText("Gmail")).click();*/	 
	}
}
