package controller;
import model.*;

/**
 * Professionshøjskolen UCN
 * IT-uddannelserne
 * Datamatiker
 * DMA-CSD-S241
 * Daniel Kristensen
 * 10632091@UCN.dk
 */

public class LPController{
    private LPContainer lpContainer;
    /* en contructor som laver et objekt */
    public LPController(){
        lpContainer = LPContainer.getInstance();
    }
    /* en setter som opretter en ny LPContainer */
    public void setLPContainer(LPContainer newLPContainer){
        lpContainer = newLPContainer;
    }
    /* den finder en LP barcaode i LPContainer */
    public LP findLP(int barcode){
        LP foundLP = lpContainer.findLP(barcode);
        return foundLP;
    }
    /* den laver metode kald til printLPS */
    public void printLPs(){
        lpContainer.printLPs();
    }
    
}
