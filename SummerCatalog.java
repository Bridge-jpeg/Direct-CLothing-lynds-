package ForImplementation;

public class SummerCatalog extends CatalogForImplementation {

    @Override
    public String getItemName() {return this.itemName;}
    public double getItemPrice() {return this.itemPrice;}
    public int getItemStock() {return this.itemStock;}
    public String getItemDescription() {return this.itemDescription;}
    
    @Override
    public boolean isCurrent() {
        return false;
    }

    public SummerCatalog(String itemName, double itemPrice, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
        this.itemDescription = itemDescription;
    }

    @Override
    public void itemInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + currency + itemPrice);
        System.out.println("InStock: " + itemStock + "\n");
        System.out.println("Item Desription: " + itemDescription + "\n");
    }
}