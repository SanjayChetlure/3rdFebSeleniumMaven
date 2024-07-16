package Module1_Login;
//pom class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage
{
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logoText;
	@FindBy(xpath = "//div[@class='bm-burger-button']") private WebElement openMenuBtn;

	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void verifySwagLabsHomePageLogo(String expLogoText) 
//	{
//		String actLogoText = logoText.getText();
//		if(actLogoText.equals(expLogoText))
//		{
//			System.out.println("TC Pass");
//		}
//		else
//		{
//			System.out.println("TC Fail");
//		}
//	}
	
	
	public String getSwagLabsHomePageLogoText()
	{
		String text = logoText.getText();
		return text;
	}
	
	
	public void clickSwagLabsHomePageOpenMenu() 
	{
		openMenuBtn.click();
	}
}
