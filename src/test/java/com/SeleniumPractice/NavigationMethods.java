package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Navigating Pages
public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.name("q")).sendKeys("Hello ");
	    driver.findElement(By.name("q")).submit();
	    driver.navigate().to("https://www.facebook.com/");
	    Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("john@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
         
	}

}
