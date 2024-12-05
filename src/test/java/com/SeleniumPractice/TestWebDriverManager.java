package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().proxy("testhost:8080").setup();
//		Using Proxy()
//		WebDriverManager.firefoxdriver().proxy("testhost:8080").setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		

	}

}
