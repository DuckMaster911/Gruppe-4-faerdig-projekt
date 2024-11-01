package tui;
import java.util.Scanner;
import controller.LoanController;


public class LoanMenu {
    // instance variables
    private LoanController loanController;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanController = new LoanController();
    }
    /* metoden til at starte programmet og vores starts menu */
    public void start() {
        loanMenu();
    }
    /* metoden til at vise låne menuen til vores TUI */
    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                  writeCreateLoanWindow();
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
    /*  metode til at skrive vores låne menu */
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlånsmenu ******");
        System.out.println(" (1) Opret lån");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    /* metode til at indtage information fra keyboarded fra vores bruger */
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    /* metode til at skrive vores låne menu vindue*/
    public void writeCreateLoanWindow() {
        loanController.createLoan();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Opret Lån ******");
        System.out.println("Indtast FriendNumber og tryk 'enter'.");
        System.out.println();
        loanController.addFriendToLoan(loanController.findFriend(getIntegerFromUser(keyboard)));
        System.out.println("Ven blev tilføjet til lånet!");
        System.out.println();
        
        loanController.printLPs();
          
        System.out.println("\n" + "Indtast barcode på den LP du ønsker at leje");
        System.out.println();
        loanController.addCopyToLoan(loanController.findCopy(loanController.findLP(getIntegerFromUser(keyboard))));
        
        System.out.println("The LP has been added to the Loan");
        System.out.println();
        loanController.confirmLoan();
        
        System.out.println("Receipt:");
        System.out.println(loanController.getCurrentLoanString());
        
    }
}

