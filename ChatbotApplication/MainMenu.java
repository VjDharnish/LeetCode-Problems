package ChatService;

import java.util.Scanner;

public class MainMenu {
    public void mainMenu() {
        System.out.println("You are currently in Main Menu\n");
        Scanner sc = new Scanner(System.in);
   outer:   while(true){
            System.out.println("Press 1 for Recharge options");
            System.out.println("Press 2 for caller tune options");
            System.out.println("Press 3 for internet related queries");
            System.out.println("Press 4 to talk with our customer service person");
            System.out.println("Press 5 to exit");
            
            int option = sc.nextInt();
     
            switch(option){
                case 1:
                    new RechargeOptions().recharge();
                    break outer;    
                case 2:
                    new CallerTune().callerTune();
                    break outer;
                case 3:
                    new InternetOptions().internet();
                    break outer;
                case 4:
                    System.out.println("Thanks for calling the customer care. Your call may be recorded for quality purposes---");
                case 5:
                    System.out.println("Thank you for using our service");
                    break outer;

                default:
                    System.out.println("Wrong input Please enter the correct number");
                    new MainMenu().mainMenu();
                    break outer;
            }
        }
  
    }
}