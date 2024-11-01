package model;



/* opretter og initiaere en klasse, samt en construct */
public class LP{
    private int barcode;
    private String title;
    private String artist;
    private String publicationDate;
    
    public LP(int newBarcode, String newTitle, String newArtist, String newPublicationDate){
        this.barcode = newBarcode;
        this.title = newTitle;
        this.artist = newArtist;
        this.publicationDate = newPublicationDate;
    }
    /* getter til at modtage en barcode */
    public int getBarcode(){
        return barcode;
    }
    /* getter til at modtage en String omkring vores LP. */
    public String getLPString(){
        String LPString = title + " af " + artist + ". Publiceret i " + publicationDate + " - Barcode: " + barcode;
        return LPString;
    }
    
}
