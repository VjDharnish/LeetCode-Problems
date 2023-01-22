package ChatService;

import java.util.Scanner;
public class Categories extends main {
	Categories(){
		main.push(main);
		options();
		
	}
	public void options() {
		System.out.println("Categories");
		System.out.println("1-> Home Appliances");
		System.out.println("2-> Groceries");
		System.out.println("3-> Furnitures");
		System.out.println("9-> Back to  previous");
		System.out.println("0-> Exit");
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			HomeAppliances obj = new HomeAppliances();
			main.push(obj);
			main.peek();
		case 9:
			main.pop();
			main.peek();
			
		
	}

}
}
