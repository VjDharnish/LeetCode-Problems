package ChatService;

import java.util.Scanner;

public class InternetOptions {


    public void internet(){

        System.out.println("------You are currently in Internet Options------\n");    
        outer: while(true){
            System.out.println("Press 1 to know the current internet balance");
            System.out.println("Press 2 to know the validity of the internet package");
            System.out.println("Press 9 to back to the main menu");
            System.out.println("Press 0 to exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            sc.close();
            switch(option){
                case 1:
                    System.out.println("Your current internet balance is 600.0MB");
                    break outer;
                case 2:
                    System.out.println("Your internet recharge validity has 5  days only");
                    back();
                    break outer;
                case 9:
                    new MainMenu().mainMenu();
                    break outer;
                case 0:
                    System.out.println("Thank you for using our service");
                    break outer;
                default:
                    System.out.println("Wrong input Please enter the correct number");
                    new InternetOptions().internet();
                    break outer;
            }
        }
    }
    public static void back(){       
    outer:  while(true){
            System.out.println("Press 1 to go back to previous menu");      
            System.out.println("Press 2 to go to Main menu");
            System.out.println("Press 0 to exit");
            Scanner sc = new Scanner(System.in);
            int option=sc.nextInt();

            switch(option){
                case 1:
                    new InternetOptions().internet();
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 3:
                    System.out.println("Thank you for using our service---------\n\n");
                    break outer;
                    
                default:
                    System.out.println("Wrong input Please enter the correct number");
                    new InternetOptions().internet();;
                    break outer;
            }  
        }
    }
}