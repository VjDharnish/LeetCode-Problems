package ChatService;

import java.util.Scanner;

public class CallerTune {
	static Scanner sc = new Scanner(System.in);
    public void callerTune(){

        System.out.println("You are currently in Caller Tune Options");

        
        outer: while(true){

            System.out.println("Press 1 to set Caller Tune");
            System.out.println("Press 2 to remove Caller Tune");
            System.out.println("Press 4 to back to the main menu");
            System.out.println("Press 5 to exit");
            
            int option = sc.nextInt();
            
            switch(option){
                case 1: 
                    System.out.println("You have successfully the set caller tune");
                    back();
                    break outer;
                case 2:
                    System.out.println("You hvae successfully removed your caller tune");
                    back();
                    break outer;

                case 4:
                    new MainMenu().mainMenu();
                    break outer;

                case 5:
                    System.out.println("Thank you for using our service");
                    break outer;

                default:
                    System.out.println("Wrong input Please enter the correct number");
                    new CallerTune().callerTune();
                    break outer;
            }
        }

    }

    public static void back(){     
     outer: while(true){

            System.out.println("\n\tPress 1 to go back to previous menu");
            System.out.println("\n\tPress 2 to go to Main menu");
            System.out.println("\n\tPress 0 to exit");   
            int option = sc.nextInt();
            
            switch(option){

                case 1:
                    new CallerTune().callerTune();;
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 0:
                    System.out.println("Thank you for using our service");
                    break outer;

                default:
                    System.out.println("Wrong input please enter again");
                    new CallerTune().callerTune();
                    break outer;

            }
        }
    }
}