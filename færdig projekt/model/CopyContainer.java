package model;
import java.util.ArrayList;


/* vi opretter klassen og initiaere den, samt laver en constructer */
public class CopyContainer{
    private ArrayList<Copy> copies;
    private static CopyContainer instance;
    
    private CopyContainer(){
        this.copies = new ArrayList<Copy>();
    }
    /* her sørger vi for der kun bliver lavet et object */
    public static CopyContainer getInstance(){
        if (instance == null){
            instance = new CopyContainer();
        }
        return instance;
    }
    /* tilføjer en ny kopi til vores copies array */
    public void addCopy(Copy newCopy){
        copies.add(newCopy);
    }
    /* søge funktion i vores copies array */
    public Copy findCopy(LP lp){
        Copy foundCopy = null;
        int index = 0;
        boolean found = false;
        while(index < copies.size() && !found){
            if(copies.get(index).getCopyOfLP() == lp && copies.get(index).getLoanedStatus() == false){
                found = true;
                foundCopy = copies.get(index);
            }
            else {
                index++;
            }
        }
        return foundCopy;
    }
    /* generere test data */
    public void createTestData(){
        Copy newCopy1 = new Copy("001", "28-09-2023", 329, LPContainer.getInstance().findLP(123));
        Copy newCopy2 = new Copy("002", "05-02-2020", 99, LPContainer.getInstance().findLP(123));
        Copy newCopy3 = new Copy("003", "12-12-2024", 125, LPContainer.getInstance().findLP(111));
        addCopy(newCopy1);
        addCopy(newCopy2);
        addCopy(newCopy3);
    }
    
}