package com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        
	    //single window
//	    String parentWindowHandle = driver.getWindowHandle();
//	    System.out.println("Parent Window handle: "+parentWindowHandle + driver.getTitle());
//	    driver.findElement(By.id("newWindowBtn")).click();
////	    Thread.sleep(2000);
//	    Set<String> windowHandles = driver.getWindowHandles();
//	    for (String windowHandle : windowHandles) {
//	    	if(!windowHandle.equals(parentWindowHandle)) {
//	    		driver.switchTo().window(windowHandle);
//	    		driver.manage().window().maximize();
//	    		driver.findElement(By.id("firstName")).sendKeys("Prasanna");
//	    		Thread.sleep(3000);
//	    		driver.close();
	    	//}
	    	
			//System.out.println(windowHandle + driver.getTitle());
			
		
//	    driver.switchTo().window(parentWindowHandle);
//	    driver.findElement(By.id("name")).sendKeys("HYR Tutorials");
       
	    //Single tab
	    String parentWindowHandle = driver.getWindowHandle();
	    System.out.println("Parent Window handle: "+parentWindowHandle + driver.getTitle());
	    driver.findElement(By.id("newTabBtn")).click();
//	    Thread.sleep(2000);
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	    	if(!windowHandle.equals(parentWindowHandle)) {
	    		driver.switchTo().window(windowHandle);
//	    		driver.manage().window().maximize();
	    		System.out.println(driver.findElement(By.id("output")).getText());
	    		driver.findElement(By.id("alertBox")).click();
	    	    System.out.println(driver.switchTo().alert().getText());
	    	    driver.switchTo().alert().accept();
	    	    System.out.println(driver.findElement(By.id("output")).getText());
	    
	    Thread.sleep(2000);
	    driver.close();
	}
	    }
	    driver.switchTo().window(parentWindowHandle);
   	    driver.findElement(By.id("name")).sendKeys("HYR Tutorials");
	    
   	    Thread.sleep(2000);
   	    driver.quit();
}
}

