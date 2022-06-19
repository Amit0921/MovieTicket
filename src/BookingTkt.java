import java.util.Scanner;
public class BookingTkt extends MovieTktBooking {
	int totalPrice, paid;
	int noSeat, choice;
	void Confirmation() {
		
		System.out.println("Enter number of tickets you want to book :");
		Scanner sc = new Scanner(System.in);
		noSeat = sc.nextInt();
		if(seats > 0 && seats > noSeat)
		{
			System.out.println("Book "+noSeat+" Tickets of "+movieName);
			System.out.println("1 for yes\n0 for No");
			choice = sc.nextInt();
			switch(choice) 
			{
				case 1:
					totalPrice = noSeat * price;
					System.out.println("Pay Rs. "+totalPrice);
					paid = sc.nextInt();
					if(totalPrice == paid) {
						System.out.println("***Payment Successful***\nPaid Rs. "+paid);
						seats = seats -noSeat; 
						System.out.println("Boooked "+noSeat+" Seats of "+movieName);
					}
					else {
						System.out.println("!!!Payment Unsuccessful!!!");
						System.exit(0);
					}
					break;
				case 0:
					System.out.println("Thank you for visiting us !!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
		else
			System.out.println("Ticket Unavailable !!!");
		sc.close();
	}
}
