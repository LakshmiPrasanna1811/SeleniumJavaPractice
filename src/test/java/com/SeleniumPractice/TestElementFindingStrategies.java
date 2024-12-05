package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementFindingStrategies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://github.com/login");
	    Thread.sleep(3000);
	    //id-tag
	    highlight(driver, driver.findElement(By.id("login_field")));
	    Thread.sleep(3000);
	    //name-tag
	    highlight(driver,driver.findElement(By.name("password")));
	    Thread.sleep(3000);
        //className-tag
	    highlight(driver, driver.findElement(By.className("header-logo")));
	    Thread.sleep(3000);
	    //LinkText-tag
	    highlight(driver, driver.findElement(By.linkText("Forgot password?")));
	    Thread.sleep(3000);
	    //PartialLinkText-Tag
	    highlight(driver, driver.findElement(By.partialLinkText("Create an")));
	    Thread.sleep(3000);
	    //tagName-tag
	    highlight(driver, driver.findElement(By.tagName("h1")));
	    Thread.sleep(3000);
	    //xpath-tag
	    highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
	    Thread.sleep(3000);
	    //CSS Selector-tag
	    highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
	    Thread.sleep(3000);
	    driver.close();
	    //driver.quit();
	}
	
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",element);
	}

}
