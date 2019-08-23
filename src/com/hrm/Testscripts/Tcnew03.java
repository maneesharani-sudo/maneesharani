package com.hrm.Testscripts;
import org.testng.annotations.Test;

import com.hrm.lib.General1;


 //import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.Reporter;public class TC_03 {
//public static void main(String args[])throws Exception{
@Test  
public class Tcnew03 {
public void tcnew3()throws Exception {  
	General1 obj=new General1(); 
	obj.openApplication();
	obj.verifytitle();
	//obj.waitStmt(); 
	obj.loginApplication();
	obj.moveTopim(); 
	obj.addEmp();
	obj.deleteEmp(); 
	obj.logout(); 
	
} 
}