package checking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends libGlobal{
	
	public  BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement clkContinue;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}

}
