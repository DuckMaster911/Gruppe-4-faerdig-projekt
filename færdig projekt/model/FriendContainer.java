package model;
import java.util.ArrayList;

/* opretter klassen og initiaere klassen, samt vi bygger en constructer*/
public class FriendContainer {
    private ArrayList<Friend> friends;
    private static FriendContainer instance;
    
    private FriendContainer(){
        this.friends = new ArrayList<Friend>();
    }
    /* her sørger vi for der kun bliver lavet et object */
    public static FriendContainer getInstance(){
        if (instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    /* tilføjer ny ven til vores friends array */
    public void addFriend(Friend newFriend){
        friends.add(newFriend);
    }
    /* søge funktion til at finde den rigtige ven */
    public Friend findFriend(int friendNumber){
        Friend foundFriend = null;
        int index = 0;
        boolean found = false;
        while(index<friends.size() && !found){
            Friend searchFriend = friends.get(index);
            if(searchFriend.getFriendNumber() == friendNumber){
                found = true;
                foundFriend = searchFriend;
            }
            else {
                index++;
            }
        }
        return foundFriend;
    }
    /* metoden til at generere test data*/
    public void createTestData(){
        Friend newFriend1 = new Friend("John", 100, "Høvej 13", 9460, "Brovst", "12345678");
        Friend newFriend2 = new Friend("Jan", 200, "Bygade 15", 9000, "Aalborg", "75402718");
        Friend newFriend3 = new Friend("Hans", 300, "Kirkeminde 2", 9690, "Fjerritslev", "02581624");
        addFriend(newFriend1);
        addFriend(newFriend2);
        addFriend(newFriend3);
    }
    
}