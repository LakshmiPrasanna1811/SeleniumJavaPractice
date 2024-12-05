package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://github.com/login");
	   WebElement usernameTxt= driver.findElement(By.id("login_field"));
	   if(usernameTxt.isDisplayed())
	   {
		   if(usernameTxt.isEnabled()) {
			   usernameTxt.sendKeys("LAKSHMI");  
			   String enteredTxt = usernameTxt.getAttribute("value");
			   System.out.println(enteredTxt);
			   Thread.sleep(3000);
			   usernameTxt.sendKeys("Prasanna");
			   Thread.sleep(3000);
			   usernameTxt.clear();
		   }
		   else
			   System.out.println("username textbox is not displayed");
	   }
	   else
		   System.out.println("username textbox is not displayed");

	}

}
