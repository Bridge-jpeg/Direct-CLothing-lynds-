package indirectclothinginc.catalog;

public class SeasonCatalog extends Catalog{
    public boolean isCurrent;

    public SeasonCatalog(String itemName, double itemPrice, byte itemStock,String itemDescription, boolean isCurrent){
        super(itemName, itemPrice, itemStock, itemDescription);
        this.isCurrent = isCurrent;
    }

    @Override
    public void itemInfo() {
        System.out.println(getItemName());
        if (isCurrent){
            System.out.println("Price: "+currency + Math.round(getItemPrice() * .70));
        }
        else {
            System.out.println("Price: " + currency + getItemPrice());
        }
        System.out.println("InStock: " +getItemStock() );
        System.out.println("Item Description: " + getItemDescription() + "\n");
    }
}
