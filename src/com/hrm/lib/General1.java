package com.hrm.lib;
import org.openqa.selenium.Alert;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
//import org.openqa.selenium.support.ui.ExpectedConditions;  
//import org.openqa.selenium.support.ui.WebDriverWait;  
import org.openqa.selenium.interactions.Actions;   
//import org.testng.annotations.Test; 
//import org.testng.annotations.BeforeClass; 
//import org.testng.annotations.AfterClass;
import org.testng.Reporter;

import com.hrm.Utility.Log;

import static org.testng.Assert.assertTrue; 
//import javax.swing.Action;
import org.openqa.selenium.support.ui.Select; 
import java.awt.Robot;
import java.awt.event.KeyEvent; 
//import java.util.concurrent.TimeUnit; 
public class General1 extends Global{
	   public void openApplication()
		{
			
			System.setProperty("webdriver.chrome.driver","F:\\\\Selenium_Suresh\\\\JavaSoftwares\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\java\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Application opened");
			Reporter.log("Application opened");
			Log.info("Application opened");
			
			
		}
		//@Test
		public void verifytitle() {
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
				System.out.println("HRMS title Matched");
				Reporter.log("HRMS title Matched");
	            Log.info("HRMS title Matched");		
			}
			else {
				System.out.println("Title Not matched");
				Reporter.log("Title Not matched");
			Log.info("Title Not matched");
				
			}
		}
		/*
		public void waitStmt() {
			//Explicit wait
			WebElement loginbtn = driver.findElement(By.name("Submit"));
			WebDriverWait wait = new WebDriverWait(driver,5000);
			wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
			driver.findElement(By.name("Submit")).click();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}*/
		//@Test
		public void loginApplication()//throws Exception
		{
			driver.findElement(By.name(namepath)).sendKeys(un);
			//Thread.sleep(1000);
			driver.findElement(By.name(passwordpath)).sendKeys(pw);
			//Thread.sleep(1000);
			driver.findElement(By.name(loginpath)).click();
			System.out.println("Login Completed");
			Reporter.log("Login Completed");
			Log.info("Login Completed");
			
			//Thread.sleep(1000);
			
		}
		public void excelLogin()
		{
			
		}
		//@Test
		public void verifyWelcometxt() //throws Exception
		{
			
			assertTrue(driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome admin"));
			System.out.println("Welcome txt Matched");
			//Thread.sleep(2000);
			Reporter.log("Welcome txt Matched");
			Log.info("Welcome txt Matched");
			
			
			
		}
		//@Test
		public void moveTopim() //throws Exception
		{
			Actions ac = new Actions(driver);
			WebElement pimmenu = driver.findElement(By.linkText(PIMpath));
			ac.moveToElement(pimmenu).perform();
			System.out.println("Moved to PIM");
			
			Reporter.log("Moved to PIM");
			Log.info("Moved to PIM");
			//Thread.sleep(1000);
					
		}
		//@Test
	    public void addEmp() //throws Exception
	    {
	    
	    	driver.findElement(By.linkText(addemp)).click();
	    	driver.switchTo().frame(frame);
	    	driver.findElement(By.name(empLnamepath)).sendKeys(empln);
	    	driver.findElement(By.name(empFnamepath)).sendKeys(empfn);
	    	//Thread.sleep(1000);
	    	driver.findElement(By.xpath(save)).click();
	    	System.out.println("Clicked on addemp");
	    	Reporter.log("Clicked on addemp");
	    	System.out.println("Emp details Added");
	    	Reporter.log("Emp details Added");
	    	Log.info("Emp details Added");
	    	//Thread.sleep(2000);
	    	
	    	driver.switchTo().defaultContent();
	    	      	
	    }
		//@Test
	    public void deleteEmp() //throws Exception
	    {
	    	//driver.navigate().back();
	    	//driver.navigate().back();
	    	driver.switchTo().frame(frame);
	    	//Thread.sleep(1000);
	        Select st = new Select(driver.findElement(By.name(arrow)));
	    	//Thread.sleep(2000);
	    	st.selectByVisibleText("Emp. ID");
	    	driver.findElement(By.name(searchid)).sendKeys(id);
	    	driver.findElement(By.xpath(search)).click();
	    	driver.findElement(By.name(checkbox)).click();
	    	System.out.println("checkbox ticked");
	    	Reporter.log("checkbox ticked");
	    	driver.switchTo().defaultContent();
	    	//Thread.sleep(2000);
	    	driver.switchTo().frame(frame);
	    	driver.findElement(By.xpath(delete)).click();
	    	//Thread.sleep(2000);
	    	System.out.println("EmpDeleted");
	    	Reporter.log("EmpDeleted");
	    	Log.info("EmpDeleted");
	    	driver.switchTo().defaultContent();
	    }
    //@AfterClass
		public void logout()//throws Exception
		{
			
			driver.findElement(By.linkText(logout)).click();
			System.out.println("Logout Completed");
			Reporter.log("Logout Completed");
			driver.close();
			System.out.println("Application closed");
			Reporter.log("Application closed");
			Log.info("Application closed");
			
		}
		public void alertsLogin()throws Exception
		{
			driver.findElement(By.name(namepath)).sendKeys(un);
			driver.findElement(By.name(loginpath)).click();
			Thread.sleep(1000);
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			Reporter.log(a.getText());
			a.accept();
			Thread.sleep(1000);
			driver.findElement(By.name(passwordpath)).sendKeys(pw);
			Thread.sleep(1000);
			driver.findElement(By.name(loginpath)).click();
		}
		public void keyboardAction()throws Exception
		{
			driver.findElement(By.name(namepath)).sendKeys(un); 
			driver.findElement(By.name(passwordpath)).sendKeys(pw);			
			Thread.sleep(1000);
			//keyboard -- Robot
			Robot k = new Robot();
			k.keyPress(KeyEvent.VK_TAB);
			k.keyRelease(KeyEvent.VK_TAB);
			System.out.println("TAB");
			Reporter.log("Tab pressed");
			Thread.sleep(1000);
			k.keyPress(KeyEvent.VK_ENTER);
			k.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("ENTER");
			Reporter.log("Enter pressed");
			Thread.sleep(3000);
			System.out.println("Login completed");
			Reporter.log("Login completed");
			Log.info("Login completed");
			
		}
		public void closeaapp() {
			driver.quit();
			
			driver.close();
			Reporter.log("application closed");
			Log.info("application closed");
		}
			
						
			
			
		}


