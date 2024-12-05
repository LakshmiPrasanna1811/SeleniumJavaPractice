package com.SeleniumPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadTimeOut {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    
	    Instant startTime = Instant.now();
	    System.out.println(startTime.toString());
	   // driver.get("https://www.royalmansour.com/en/");
	    driver.get("https://www.google.com/");
	    Instant endTime = Instant.now();
	    System.out.println(endTime.toString());
	    Duration duration =Duration.between(startTime, endTime);
	    System.out.println("PageLoad Time: "+duration.toMillis());
	    System.out.println(driver.getTitle());
	    driver.quit();;

	}

}
