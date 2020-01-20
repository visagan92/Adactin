package checking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends libGlobal{
	
	public  Booking() {
		PageFactory.initElements(driver, this);
	}
   @FindBy(id = "first_name")
   private WebElement firstName;
   @FindBy(id = "last_name")
   private WebElement lastName;
   @FindBy(id="address")
   private WebElement address;
   @FindBy(id= "cc_num")
   private WebElement creditNo;
   @FindBy(id= "cc_type")
   private WebElement cardType;
   @FindBy(id= "cc_exp_month")
   private WebElement month;
   @FindBy(id= "cc_exp_year")
   private WebElement year;
   @FindBy(id= "cc_cvv")
   private WebElement cvv;
   @FindBy(id= "book_now")
   private WebElement clkBook;
   
   public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditNo() {
	return creditNo;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getClkBook() {
	return clkBook;
}

  
   
}
