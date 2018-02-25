package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_createLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC002_createLead";
		testDescription="To create a new lead";
		testNodes="Create Lead";
		category="BVT";
		authors="Amazon";
		browserName="chrome";

		dataSheetName="TC003";
	}
	

	@Test(dataProvider="fetchData")
	public void createLead (String uName,String pwd,String vName, String cName, String fName, String lName) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrm()
		.clickLeads()
		.clickCLeads()
		.cName(cName)
		.fName(fName)
	    .lName(lName)
	    .clickcleadButton();
		
		
		
	}
		
}
