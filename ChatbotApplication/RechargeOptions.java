package ChatService;

import java.util.Scanner;

public class RechargeOptions {

 
    public void recharge() {

        System.out.println("You are currently in Recharge Options\n");

       
    outer:  while(true){

            System.out.println("Press 1 to know the balance");
            System.out.println("Press 2 to know the validity of your current recharge");
            System.out.println("Press 3 to know the Offer for your number");
            System.out.println("Press 4 to return to the main menu");
            System.out.println("Press 5 to exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch(option){

                case 1:
                    System.out.println("Your Current balance is 45 rs");
                    back();
                    break outer;

                case 2:
                    System.out.println("Your Validity for the current plan exist till 20 jan");
                    back();
                    break outer;

                case 3:
                    System.out.println("You have Full talktime at Rs 99 ");
                    back();
                    break outer;

                case 4:
                    new MainMenu().mainMenu();
                    break outer;

                case 5:
                    System.out.println("Thank you for using our service");
                    break outer;

                    
                default:
                    System.out.println("Wrong input Please input the correct number\n");
                    new RechargeOptions().recharge();
                    break outer;

            }
        }
        
    }

    public static void back(){
        

      
    outer:  while(true){

            System.out.println("Press 1 to go back to previous menu"); 
            System.out.println("Press 2 to go to Main menu");
            System.out.println("Press 3 to exit");
            Scanner sc = new Scanner(System.in);
            int option=sc.nextInt();

            switch(option){

                case 1:
                    new RechargeOptions().recharge();
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 3:
                    System.out.println("Thank you for using our service");
                    break outer;

            }
            
        }
    }
}