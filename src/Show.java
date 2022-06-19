import java.util.Scanner;
public class Show {
	public static void main(String args[]) {
		//MovieTktBooking m = new MovieTktBooking();
		//m.print();
		Scanner sc = new Scanner(System.in);
		String nm;
		String cntct;
		System.out.println("\n*** Sign in to book ticket ***\n");
		System.out.println("Enter your name : ");
		nm = sc.nextLine();
		System.out.println("Enter your Phone number : ");
		cntct = sc.nextLine();
		User u = new User(nm,cntct);
		u.print();
		u.UserDetails();
		System.out.println("**Seat Availability Status After Booking**\n");
		u.print();
		sc.close();
	}
}
