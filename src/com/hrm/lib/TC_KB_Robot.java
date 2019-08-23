package com.hrm.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KB_Robot {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\POM\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	Thread.sleep(1000);
	//keyboard -- Robot
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	//r.keyRelease(KeyEvent.VK_TAB);
	System.out.println("TAB");
	Thread.sleep(3000);
	//r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("ENTER");
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
