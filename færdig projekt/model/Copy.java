package model;

/* vi opretter klassen og initiaere den, samt laver en constructer */
public class Copy {
    private String serialNumber;
    private String purchaseDate;
    private double purchasePrice;
    private boolean loanedStatus;
    private LP copyOfLP;
    
    
    public Copy(String newSerialNumber, String newPurchaseDate, double newPurchasePrice, LP lp){
        this.serialNumber = newSerialNumber;
        this.purchaseDate = newPurchaseDate;
        this.purchasePrice = newPurchasePrice;
        this.loanedStatus = false;
        this.copyOfLP = lp;
    }
    /* getter til Vores serie nummer*/
    public String getSerialNumber(){
        return serialNumber;
    }
    /* setter til nye låne status*/
    public void setLoanedStatus(boolean newLoanStatus){
        loanedStatus = newLoanStatus;
    }
    /* getter til at modtage vores låne status */
    public boolean getLoanedStatus(){
        return loanedStatus;
    }
    /* getter til at modtage kopien af en LP */
    public LP getCopyOfLP(){
        return copyOfLP;
    }
    
}
