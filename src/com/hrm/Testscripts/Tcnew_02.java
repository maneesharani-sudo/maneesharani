package com.hrm.Testscripts;
import org.testng.annotations.Test;

import com.hrm.lib.General1;


//import org.testng.annotations.BeforeMethod;//import org.testng.annotations.AfterMethod;
//import org.testng.Reporter;public class TC_02 {    
//public static void main (String args[])throws Exception { 
public class Tcnew_02 {


@Test
	public void Tcnew_02()throws Exception {
	General1 obj=new General1();
	    obj.openApplication();
	    obj.verifytitle();
	    //obj.waitStmt(); 
	    obj.loginApplication();
	    obj.verifyWelcometxt();
	    obj.moveTopim(); 
	    obj.addEmp();  
	    obj.logout(); 
	    }  
}