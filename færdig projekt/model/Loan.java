package model;
import java.time.LocalDate;
/* laver en klasse og initiaere klassen samt vi laver en constructer*/
public class Loan {
    private int loanNumber;
    private LocalDate borrowDate;
    private LocalDate deadLine;
    private boolean activeStatus;
    private Friend friend;
    private Copy loanedCopy;
    
    public Loan(int newLoanNumber, LocalDate currentDate, LocalDate newDeadLine, boolean newStatus){
        this.loanNumber = newLoanNumber;
        this.borrowDate = currentDate;
        this.deadLine = newDeadLine;
        this.activeStatus = newStatus;
        this.friend = null;
        this.loanedCopy = null;
        
    }
    /* setter til ny ven*/
    public void setFriend(Friend newFriend){
        this.friend = newFriend;
    }
    /* getter til vores ven*/
    public Friend getFriend(){
        return friend;
    }
    /* getter til vores låne kopi*/
    public Copy getLoanedCopy(){
        return loanedCopy;
    }
    /* getter til vores låne dato*/
    public LocalDate getBorrowDate(){
        return borrowDate;
    }
    /* getter til vores afleveringsfrist for lånet*/
    public LocalDate getDeadline(){
        return deadLine;
    }
    /* setter til vores nye kopi*/
    public void setCopy(Copy newCopy){
        this.loanedCopy = newCopy;
    }
}
