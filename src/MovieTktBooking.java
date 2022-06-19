public class MovieTktBooking {
	String movieName;
	String Hall; 
	int seats, price;
	
	MovieTktBooking() {
		movieName = "SpiderMan";
		Hall = "Ceneplex";
		seats = 150;
		price = 200;
	}
	
	void print() {
		System.out.println("Movie Name : "+movieName);
		System.out.println("Hall Name : "+Hall);
		System.out.println("Ticket Price : "+price);
		System.out.println("Available seats : "+seats);
	}

}
