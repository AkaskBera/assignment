package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class POMActitimeWorkPage extends BasePage
{
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesOfWorkLink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement nameTextfield;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropDownList;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createWorkButton;
	
	public POMActitimeWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void workMethod() throws InterruptedException
	{
		Thread.sleep(10000);
		settingsLink.click();
		typesOfWorkLink.click();
		Thread.sleep(6000);
		createTypeOfWorkButton.click();
		nameTextfield.sendKeys("planning");
		selectbyvisibletext(statusDropDownList, "archived");
		createWorkButton.click();
	}
}

