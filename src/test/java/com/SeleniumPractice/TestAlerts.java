package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {

	//alert box, confirm box((Y/N), prompt box(input)
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    
	    //Alert Box
//	    System.out.println(driver.findElement(By.id("output")).getText());
//	    driver.findElement(By.id("alertBox")).click();
//	    Thread.sleep(3000);
//	    System.out.println(driver.switchTo().alert().getText());
//	    driver.switchTo().alert().accept();
//	    System.out.println(driver.findElement(By.id("output")).getText());
//	    Thread.sleep(3000);
        //driver.close();
	    
	    //Confirm box
//	    System.out.println(driver.findElement(By.id("output")).getText());
//	    driver.findElement(By.id("confirmBox")).click();
//	    Thread.sleep(3000);
//	    System.out.println(driver.switchTo().alert().getText());
//	     
//	    /*positive action*/
//	    driver.switchTo().alert().accept(); 
//	    System.out.println(driver.findElement(By.id("output")).getText());
//	    Thread.sleep(3000);
//        //driver.close();
//	    
//	        /*negative action*/
//	    driver.findElement(By.id("confirmBox")).click();
//	    Thread.sleep(3000);
//	    System.out.println(driver.switchTo().alert().getText());
//	    driver.switchTo().alert().dismiss(); //negative action
//	    System.out.println(driver.findElement(By.id("output")).getText());
//	    Thread.sleep(3000);
	    
	    //Prompt box
	    System.out.println(driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("promptBox")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.switchTo().alert().getText());
	     
	    driver.switchTo().alert().sendKeys("Testing Alerts ");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept(); 
	    System.out.println(driver.findElement(By.id("output")).getText());
	    Thread.sleep(2000);
	    driver.findElement(By.id("promptBox")).click();
	    
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss(); //negative action
	    System.out.println(driver.findElement(By.id("output")).getText());
	    Thread.sleep(2000);
	    driver.quit();
	}

}
