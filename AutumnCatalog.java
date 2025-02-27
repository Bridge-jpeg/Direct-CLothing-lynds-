package ForImplementation;

public class AutumnCatalog extends CatalogForImplementation {

    @Override
    public String getItemName() {return this.itemName;}
    public double getItemPrice() {return this.itemPrice;}
    public int getItemStock() {return this.itemStock;}
    
    @Override
    public boolean isCurrent() {
        return false;
    }

    public AutumnCatalog(String itemName, double itemPrice, int itemStock) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
    }

    @Override
    public void itemInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + currency + itemPrice);
        System.out.println("InStock: " + itemStock + "\n");
    }
}