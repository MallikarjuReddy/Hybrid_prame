package Testscript;

import org.testng.annotations.Test;

import Generic.Fetch_Data;
import Generic.Generic_class;
import pom.Pom;

public class Login_Script extends Generic_class
{
	@Test
	public void create() {
		
	String un=Fetch_Data.get_value("Sheet1", 0, 0);
	String pwd=Fetch_Data.get_value("Sheet1", 0, 1);
	Pom p = new Pom(driver);
	p.email(un);
	p.pswd(pwd);
	p.button();
	
}
}
