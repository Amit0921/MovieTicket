public class User extends BookingTkt {
	String userName;
	String cntctNo;
	
	User(String u_name, String phno) {
		userName = u_name;
		cntctNo = phno;
	}
	
	void UserDetails() {
		Confirmation();
		System.out.println("\n----------------------------------\n***** Bill *****");
		System.out.println("User Name : "+userName);
		System.out.println("Contact Number : "+cntctNo);
		System.out.println("Movie : "+movieName);
		System.out.println("Hall Name : "+Hall);
		System.out.println("Seats Booked : "+noSeat);
		System.out.println("Amount Paid : "+paid);
		System.out.println("----------------------------------\n");
	}
}
