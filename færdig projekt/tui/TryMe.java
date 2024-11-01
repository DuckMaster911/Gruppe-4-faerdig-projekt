package tui;
import model.*;


/* opretter en klasse og initiaere samt en constructer. */
public class TryMe{
    private CopyContainer cc;
    private FriendContainer fc;
    private LPContainer lpc;
    
    
    public TryMe(){
        cc = CopyContainer.getInstance();
        fc = FriendContainer.getInstance();
        lpc = LPContainer.getInstance();
    }
    /* generere test data */
    public void createTestData(){
        //getInstance
        //create some Friends and LPs
        lpc.createTestData();
        fc.createTestData();
        cc.createTestData();
    }
    
}
