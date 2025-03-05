package indirectclothinginc.catalog;

public class SpringCatalog extends Catalog {
    @Override
    public boolean isCurrent(){
        return true;
    }
    @Override
    public String getItemName(){return this.itemName;}
    public double getItemPrice(){return this.itemPrice;}
    public int getItemStock(){return this.itemStock;}
    public String getItemDescription() {return this.itemDescription;}


    public SpringCatalog(String itemName, double itemPrice, int itemStock,String itemDescription){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
        this.itemDescription = itemDescription;
        
    }


    @Override
    public void itemInfo(){
        System.out.println("Item: " +itemName);
        System.out.println("Price: "+currency +itemPrice);
        System.out.println("InStock: " +itemStock );
        System.out.println("Item Description: " + itemDescription + "\n");
    }

//    @Override
//    public double isDiscounted(boolean isCurrent) {
//        if (isCurrent){
//            return itemPrice = itemPrice*.7;
//        }
//        else {
//            return itemPrice;
//        }
//    }
    /*
    method (boolean isCurrent){
        if isCurrent{
            return itemPrice = itemPrice*.70;
        }
    }
     */
}
