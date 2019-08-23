package com.hrm.lib;
import org.openqa.selenium.WebDriver;
public class Global{
public WebDriver driver;
public String url="http://127.0.0.1/orangehrm-2.6/login.php";
public String un="admin";
public String pw="admin";
public String namepath="txtUserName";
public String passwordpath="txtPassword";
public String loginpath="Submit";
public String logout ="Logout";
public String PIMpath="PIM";
public String addemp="Add Employee";
public String empfn="maneesha";
public String empln="rani";
public String empLnamepath="txtEmpLastName";
public String empFnamepath="txtEmpFirstName";
public String save="//input[@id=\"btnEdit\"]";
public String arrow="loc_code";
public String searchid="loc_name";
public String frame ="rightMenu";
public String id="0019"; 
public String search="//*[@id=\"standardView\"]/div[2]/input[2]";
public String checkbox="chkLocID[]";
public String delete ="//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";            }  