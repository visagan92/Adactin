package checking;

public class Adactin {
	
	public static void main(String[] args) {
		
		libGlobal.launchchromebrowser();
		libGlobal.maximizeWindow();
		libGlobal.loadurl("https://www.adactin.com/HotelApp/");
		
		LoginPage lp = new LoginPage();
		libGlobal.fill(lp.getTxtUserName(), "visaadactin");
		libGlobal.fill(lp.getTxtPassword(), "vitodonvisa");
		libGlobal.btnClick(lp.getLoginBtn());
		
		SearchHotelPage Shp = new SearchHotelPage();
		libGlobal.SBI(Shp.getSelectHotel(), 1);
		libGlobal.SBI(Shp.getSelectLoc(),1);
		libGlobal.SBI(Shp.getSelectRoom(),1);
		libGlobal.SBI(Shp.getNoOfRoom(), 1);
		
		libGlobal.clear(Shp.getCheckIn());
		libGlobal.clear(Shp.getCheckOut());
		
		libGlobal.fill(Shp.getCheckIn(), "21/01/2020");
		libGlobal.fill(Shp.getCheckOut(), "22/01/2020");						
		libGlobal.SBI(Shp.getAdult(), 1);
		libGlobal.SBI(Shp.getChild(), 1);
		libGlobal.btnClick(Shp.getSubmit());
		
		BookHotelPage bhp = new BookHotelPage();
		libGlobal.btnClick(bhp.getRadio());
		libGlobal.btnClick(bhp.getClkContinue());
		
		Booking b = new Booking();
		libGlobal.fill(b.getFirstName(), "visa");
		libGlobal.fill(b.getLastName(), "sundaravadivel");
		libGlobal.fill(b.getAddress(), "omr thoraipakkum greens");
		libGlobal.fill(b.getCreditNo(), "1234567891234567");
		libGlobal.SBI(b.getCardType(), 1);
		libGlobal.SBI(b.getMonth(), 1);
		libGlobal.SBI(b.getYear(), 10);
		libGlobal.fill(b.getCvv(), "463");
		libGlobal.btnClick(b.getClkBook());
	}
	
	

}
