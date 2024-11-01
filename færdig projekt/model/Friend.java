package model;

/* laver en klasse og initiaere klassen samt vi laver en constructer*/
public class Friend {
    private String name;
    private int friendNumber;
    private String address;
    private int postalcode;
    private String city;
    private String phone;
    
    public Friend(String newName, int newFriendNumber, String newAddress, int newPostalcode, String newCity, String newPhone){
        this.name = newName;
        this.friendNumber = newFriendNumber;
        this.address = newAddress;
        this.postalcode = newPostalcode;
        this.city = newCity;
        this.phone = newPhone;
    }
    /* getter til Vores vens navn*/
    public String getName(){
        return name;
    }
    /* getter til vores vens nummer*/
    public int getFriendNumber(){
        return friendNumber;
    }
    
}
