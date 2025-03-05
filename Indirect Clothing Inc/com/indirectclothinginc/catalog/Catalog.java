package indirectclothinginc.catalog;

public abstract class Catalog {

    private String itemName;
    public String getItemName() {
        return itemName;
    }

    private double itemPrice;
    public double getItemPrice() {
        return itemPrice;
    }

    private byte itemStock;
    public byte getItemStock() {
        return itemStock;
    }
/*
    Byte instead of int for storage
    Byte = 8 bit
    int = 32 bit
 */

    private String itemDescription;
    public String getItemDescription() {
        return itemDescription;
    }

    public abstract void itemInfo();
    public static String currency = "PHP ";

    public Catalog(String itemName, double itemPrice, byte itemStock, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
        this.itemDescription = itemDescription;
    }
}
