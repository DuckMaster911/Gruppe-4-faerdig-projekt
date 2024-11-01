package controller;
import model.*;
import java.time.LocalDate;

/**
 * Loan Controller tjekker om der loan til stede
 * tjekker Friend controller/container om der er Friends
 * Laver en Friend container
 * Tjekker LP controller/container om der er LP
 * Laveer LP container
 * Tjekker Copy controller/container om der er Copy
 * Laver Copy container
 * 
 */

public class LoanController{
    private LoanContainer loanContainer;
    private FriendController friendController;
    private CopyController copyController;
    private LPController lpController;
    private Loan currentLoan;
    
    /* dette er contructoren som opretter objekter */
    public LoanController(){
        loanContainer = LoanContainer.getInstance();
        friendController = new FriendController();
        copyController = new CopyController();
        lpController = new LPController();
        
    }
    /* En setter til en loanContainer */
    public void setLoanContainer(LoanContainer newLoanContainer){
        loanContainer = newLoanContainer;
    }
    /* En getter til en loanContainer */
    public LoanContainer getLoanContainer(){
        return loanContainer;
    }
    /* en setter til en copyController */
    public void setCopyController(CopyController newCopyController){
        copyController = newCopyController;
    }
    /* en setter til friendController */
    public void setFriendController(FriendController newFriendController){
        friendController = newFriendController;
    }
    /* en setter til lpController */
    public void setLPController(LPController newLPController){
        lpController = newLPController;
    }
    /* en getter til loan */
    public Loan getCurrentLoan(){
        return currentLoan;
    }
    /* Her laver den et lån og henter LocalDate */
    public void createLoan(){
        LocalDate currentDate = LocalDate.now();
        currentLoan = new Loan(getLoanContainer().getInstance().getLoansSize(), currentDate, currentDate.plusDays(7), true);
    }
    /* her confirmer den lånet */
    public void confirmLoan(){
        loanContainer.addLoan(currentLoan);
    }
    /* Her finder den en Friend i friendContainer og returner friend */
    public Friend findFriend(int friendNumber){
        Friend foundFriend = friendController.findFriend(friendNumber);
        return foundFriend;
    }
    /* her forbinder en friend til det oprettede lån */
    public void addFriendToLoan(Friend friendToAdd){
        currentLoan.setFriend(friendToAdd);
    }
    /* her finder den en lp */
    public LP findLP(int barcode){
        LP lpFound = lpController.findLP(barcode);
        return lpFound;
    }
    /* her finder den en copy af lp'en */
    public Copy findCopy(LP lp){
        Copy foundCopy = copyController.findCopy(lp);
        return foundCopy;
    }
    /* en setter til copy */
    public void addCopyToLoan(Copy copyToAdd){
        currentLoan.setCopy(copyToAdd);
    }
    /* her printer den en liste over alle lp'er */
    public void printLPs(){
        System.out.println("Her er en liste over alle LP'er:");
        lpController.printLPs();
    }
    /* en getter til at få en kvittering til lånet */
    public String getCurrentLoanString(){
        String currentLoanString =
        "You loaned 1 copy of: " +
        currentLoan.getLoanedCopy().getCopyOfLP().getLPString() +
        "\n" + "Udlånsdato: " + currentLoan.getBorrowDate() + "\n" + "Afleveringsfrist "
        + currentLoan.getDeadline() + "\n" + "\n";
        
        
        return currentLoanString;
    }
    
}
