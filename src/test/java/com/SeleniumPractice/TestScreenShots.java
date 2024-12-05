package com.SeleniumPractice;

import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

//here (TakesScreenshot) makes casting {only applicable when webdriver is used} ex: File and ByteArray
//RemoteWebDriver and ChromeDriver works normally as mentioned in the BASE64 model
public class TestScreenShots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	   
	    //file
	    
	    
//	    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File destFile = new File("./Screenshots/img1.png");
//        FileUtils.copyFile(sourceFile, destFile);
//        System.out.println("Screenshot saved successfully");
//        
        
        
        //Byte Array
//        byte[] byteArr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        
//        File destFile = new File("./Screenshots/img2.png");
//        FileOutputStream fos = new FileOutputStream(destFile);
//        fos.write(byteArr);
//        fos.close();
//        System.out.println("Screenshot saved successfully");
//        
	    //BASE64
        String base64code= driver.getScreenshotAs(OutputType.BASE64);
        byte[] byteArr = Base64.getDecoder().decode(base64code);
        File destFile = new File("./Screenshots/img.png");
        FileOutputStream fos = new FileOutputStream(destFile);
        fos.write(byteArr);
        fos.close();
        System.out.println("Screenshot saved successfully");
        
        driver.quit();
	}

}
