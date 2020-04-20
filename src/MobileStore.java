import java.util.Scanner;

public class MobileStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------------------");
		System.out.println(("|--Items Availiable in Store--|"));
		System.out.println("---------------------------------");
		System.out.println("|1. Mobile     |");
		System.out.println("|2. Telephone  |");
		System.out.println("|3. EXIT       |");
		System.out.println("----------------------------------");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: PhoneDetails.mobile();
		        break;
		case 2: PhoneDetails.telephone();
		        break;
		case 3: System.exit(0);
		        break;
		default: System.out.println("Please enter your choice between 1 to 3");
		}
		
		}
	}

}
