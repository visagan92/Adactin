package checking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends libGlobal {
	public  SearchHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(id = "location")
	 private WebElement selectLoc;
	 
	 @FindBy(id = "hotels")
	 private WebElement selectHotel;
	 
	 @FindBy(id = "room_type")
	 private WebElement selectRoom;
	 
	 @FindBy(id = "room_nos")
	 private WebElement noOfRoom;
	 
	 @FindBy(id ="datepick_in")
	 private WebElement checkIn;
	 
	 @FindBy(id = "datepick_out")
	 private WebElement checkOut;
	 
	 @FindBy(id = "adult_room")
	 private WebElement adult;
	 
	 @FindBy(id = "child_room")
	 private WebElement child;
	 
	 @FindBy(id ="Submit")
	 private WebElement submit;

	public WebElement getSelectLoc() {
		return selectLoc;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	 
	 
	 

}
