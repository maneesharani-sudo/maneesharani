package com.hrm.Testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.hrm.lib.General1;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod
;//import org.testng.Reporter;
public class TCnew_01 {
//public static void main (String args[]) throws Exception{ 
	@Test 
	public void Test1()throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General1 obj=new General1();
		obj.openApplication();
		obj.verifytitle(); 
		//obj.waitStmt(); 
		obj.loginApplication();
		obj.verifyWelcometxt();
		obj.logout();
		}
        }