package indirectclothinginc.catalog;

public abstract class Catalog {
/*   Why protected instead of private?
     https://stackoverflow.com/a/42332944
 */
    public abstract boolean isCurrent();
    public abstract void itemInfo();
    public static String currency = "PHP " ;

    protected String itemName;
    public abstract String getItemName();

    protected double itemPrice;
    public abstract double getItemPrice();

    protected int itemStock;
    public abstract int getItemStock();

    protected String itemDescription;
    public abstract String getItemDescription();

}
