package model;
import java.util.ArrayList;

/* LoanContainer klasse, hvor vi initiare klassen og laver en LoanContainer constructer. */
public class LoanContainer {
    private ArrayList<Loan> loans;
    private static LoanContainer instance;
    private int loansSize;
    
    
    private LoanContainer(){
        this.loans = new ArrayList<Loan>();
        loansSize = 0;
    }
    /* her sørger vi for der kun bliver lavet et object */
    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    /* her incrementere vi vores låne arrays størrelse*/
    public void setLoansSize(){
        loansSize++;
    }
    /* getter til at modtage vores loansSize */
    public int getLoansSize(){
        return loansSize;
    }
    /*  her tilføjer vi et nyt loan til vores array */
    public void addLoan(Loan newLoan){
        loans.add(newLoan);
    }
}
