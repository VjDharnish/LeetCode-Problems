package ChatService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Welcome to IVR Calling application\n");

        while(true){

            System.out.println("Select your Preferred Language");

            String[] lang ={"Tamil","English","Hindi"};

            System.out.format("Press 1 for %s\nPress 2 for %s\nPress 3 for %s\n",lang[0],lang[1],lang[2]);

            Scanner sc = new Scanner(System.in);
            int langIndex=sc.nextInt()-1;
       
            

            if(langIndex>2 || langIndex <0){

                System.out.println("Invalid input please enter the correct option");
                continue;

            }

            System.out.format("You have chosen %s language\n\n",lang[langIndex]);
            break;
        }

        MainMenu menu = new MainMenu();
        menu.mainMenu();
        
       
    }
}
