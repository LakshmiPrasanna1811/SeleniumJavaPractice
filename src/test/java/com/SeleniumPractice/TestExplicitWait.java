package com.SeleniumPractice;

import java.util.Set;
//import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//To achieve Explicit wait, we can use WebDriverWait and FluentWait

public class TestExplicitWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    //driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    //WebDriverWait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    
	    driver.get("https://www.tricentis.com/");
//	    String parentWindow =driver.getWindowHandle();
	    driver.findElement(By.linkText("Contact")).click();
//	    Set<String> windowHandles =driver.getWindowHandles();
//	    for (String windowHandle : windowHandles) {
//			if(!windowHandle.equals(parentWindow)) {
//				driver.switchTo().window(windowHandle);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
			driver.findElement(By.id("FirstName")).sendKeys("First");
				
				driver.close();
				driver.quit();
			}
		
	    
        
	}


