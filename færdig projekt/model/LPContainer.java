package model;
import java.util.ArrayList;


/* vi opretter klassen og initiaere den, samt laver en constructer */
public class LPContainer{
    private ArrayList<LP> lps;
    private static LPContainer instance;
    
    private LPContainer(){
        this.lps = new ArrayList<LP>();
    }
    /* her sørger vi for der kun bliver lavet et object */
    public static LPContainer getInstance(){
        if (instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    /* tilføjer ny lp til vores lps array */
    public void addLP(LP newLP){
        lps.add(newLP);
    }
    /* søge metode til at finde den rigtige lp i vores lps array */
    public LP findLP(int barcode){
        LP foundLP = null;
        int index = 0;
        boolean found = false;
        while(index < lps.size() && !found){
            if(lps.get(index).getBarcode() == barcode){
                found = true;
                foundLP = lps.get(index);
            }
            else {
                index++;
            }
        }
        return foundLP;
    }
    /* metode til at printe hele vores array list lps */
    public void printLPs(){
        int index = 0;
        while(index < lps.size()){
            System.out.println(lps.get(index).getLPString());
            index++;
        }
    }
    /* generere test data */
    public void createTestData(){
        LP newLP1 = new LP(123, "Yellow Submarine", "The Beatles", "1966");
        LP newLP2 = new LP(111, "Midt om natten", "Kim Larsen", "1983");
        LP newLP3 = new LP(222, "Come Fly With Me", "Frank Sinatra", "1958");
        addLP(newLP1);
        addLP(newLP2);
        addLP(newLP3);
    }
}
