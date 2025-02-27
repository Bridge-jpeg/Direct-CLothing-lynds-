package ForImplementation;

public class WinterCatalog extends CatalogForImplementation {

    @Override
    public String getItemName() {return this.itemName;}
    public double getItemPrice() {return this.itemPrice;}
    public int getItemStock() {return this.itemStock;}
    public String getItemDescription() {return this.itemDescription;}
    
    @Override
    public boolean isCurrent() {
        return false;
    }

    public WinterCatalog(String itemName, double itemPrice, int itemStock, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
        this.itemDescription = itemDescription;
    }

    @Override
    public void itemInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + currency + itemPrice);
        System.out.println("InStock: " + itemStock );
        System.out.println("Item Desription: " + itemDescription + "\n");
    }
}