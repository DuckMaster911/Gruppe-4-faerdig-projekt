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

public class CopyController{
    private CopyContainer copyContainer;
    /* contructor opretter objekt */
    public CopyController(){
        copyContainer = CopyContainer.getInstance();
    }
    /* en stter til en copyContainer */
    public void setCopyContainer(CopyContainer newCopyContainer){
        copyContainer = newCopyContainer;
    }
    /* Den finder en copy i containeren */
    public Copy findCopy(LP lp){
        Copy foundCopy = copyContainer.findCopy(lp);
        return foundCopy;
    }
}
