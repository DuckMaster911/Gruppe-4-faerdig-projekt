package tui;
import java.util.Scanner;



public class LPMenu {
    // instance variables
    

    /**
     * Constructor for objects of class LoanMenu
     */
    public LPMenu() {
        // initialise instance variables
        
       
    }
    /* printer LP menuen til skærmen */
    public void start() {
        LPMenu();
    }
    /* bestemmer hvad aktion der skal ske, udfra brugeren indput */
    private void LPMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLPMenu();
            switch (choice) {
                case 1:
                  System.out.println(" Denne er ikke implementeret endnu!");
                  break;
                case 2:
                  System.out.println(" Denne er ikke implementeret endnu!");
                  break;
                case 3:
                  System.out.println(" Denne er ikke implementeret endnu!");
                  break;
                case 0:
                  running = false;
                  break;
                default:
                  System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                  break;
            }
        }
    }
    /* bestemmer hvad der skal printes til skærmen */
    private int writeLPMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** LP Menu ******");
        System.out.println(" (1) LP Liste");
        System.out.println(" (2) Tilføj LP");
        System.out.println(" (3) Fjern LP");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    /* modtager information fra brugerens keyboard */
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
}
