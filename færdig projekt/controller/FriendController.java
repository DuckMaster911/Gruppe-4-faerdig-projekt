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

public class FriendController{
    private FriendContainer friendContainer;
    /* contructor til at oprette et objekt */
    public FriendController(){
        friendContainer = FriendContainer.getInstance();
    }
    /* en setter til at lave en ny friendContainer */
    public void setFriendContainer(FriendContainer newFriendContainer){
        friendContainer = newFriendContainer;
    }
    /* den finder en friend som en int i friendContainer */
    public Friend findFriend(int friendNumber){
        Friend foundFriend = friendContainer.findFriend(friendNumber);
        return foundFriend;
    }
}
