package com.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regform  {
	public static void main (String args[]) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","/home/dhanvika/Downloads/chrome_linux64/89/chromedriver");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.findElement(By.id("username")).sendKeys("vivek.sakhamuri@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("password")).sendKeys("9492716980");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
driver.close();
	}



}

		
		