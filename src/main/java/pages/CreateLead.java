package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{


	public CreateLead()
	{
		PageFactory.initElements(driver,this);

	}



	@FindBy(how=How.ID, using ="createLeadForm_companyName")
	private WebElement eleCName ;


	public CreateLead cName(String data)
	{
		type(eleCName, data);
		return this;
	}
	@FindBy(how=How.ID,using= "createLeadForm_firstName")
	private WebElement elefName ;

	
	public CreateLead fName(String data)
	{
		type(elefName, data);
		return this;
	}

	@FindBy(how=How.ID,using= "createLeadForm_lastName")
	private WebElement elelName ;

	
	public CreateLead lName(String data)
	{
		type(elelName, data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using ="smallSubmit")
	private WebElement eleCleadButton ;
	
	public ViewLead clickcleadButton(){
		click(eleCleadButton);
		return new ViewLead();
		
	}
	
	
	
}
