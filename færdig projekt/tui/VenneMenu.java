package tui;
import java.util.Scanner;




public class VenneMenu {
    // instance variables
    

    /**
     * Constructor for objects of class LoanMenu
     */
    public VenneMenu() {
        // initialise instance variables
        
       
    }
    /* priner vores venne menu */
    public void start() {
        VenneMenu();
    }
    /* bestemmer hvad aktion der skal ske, udfra brugeren indput */
    private void VenneMenu() {
        boolean running = true;
        while (running) {
            int choice = writeVenneMenu();
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
    private int writeVenneMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** VenneMenu ******");
        System.out.println(" (1) Venneliste");
        System.out.println(" (2) Tilføj ven");
        System.out.println(" (3) Fjern ven");
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
