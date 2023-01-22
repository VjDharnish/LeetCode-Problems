package ChatService;

import java.util.Scanner;

public class Orders {
	public void options() {
		System.out.println("1-> Current Orders");
		System.out.println("2-> Previous Orders");
		System.out.println("9-> Back to previous");
		System.out.println("0-> Exit");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();
		switch(choice) {
		case 1:
			CurrentOrders obj = new CurrentOrders();
			main.push(obj.options());
			
			
		}
	}

}
