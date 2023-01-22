package ChatService;

import java.util.Scanner;

public class HomeAppliances extends Categories {
	HomeAppliances(){
		options();
		System.out.println("kirubhahome");
	}

	public void options() {
		System.out.println("1-> TV");
		System.out.println("2-> Fridge");
		System.out.println("3-> Washing Machine");
		System.out.println("9-> Back to previous");
		System.out.println("0-> Exit");
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("10 Tv are available");
			break;
		case 2:
			System.out.println("20 Frides are available");
			break;
		case 3:
			System.out.println("10  Washing Machine are available");
			break;
		case 9:
			main.pop();
			main.peek();
			
	}
		

}
}
