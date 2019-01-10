
package testmysql;

/**
 *
 * @author Twana
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private String expDate;
    private byte [] picture;

    public Product(int id, String name, float price, String expDate, byte[] picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.picture = picture;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public String getExpDate(){
        return expDate;
    }
    public byte[] getPicture(){
        return picture;
    }      
    
}
