package indirectclothinginc.inventoryside;
import indirectclothinginc.catalog.Catalog;

public class Order {
    public String itemName;
    public Byte itemQuantity;
    public double itemPrice;

    public void applyDiscount(boolean isCurrent) {
        Discount discount = new Discount();
        this.itemPrice = discount.isDiscount(isCurrent, this.itemPrice);
    }

    public void printReceipt(String userName, String userAddress, String userContactNumber, String itemName, double itemPrice, Byte itemQuantity, String paymentType, int paymentID){
        System.out.println(" ");
        System.out.println("===========Receipt===========");
        System.out.println("Name:"+ userName);
        System.out.println("Address: " + userAddress);
        System.out.println("Contact number: "+userContactNumber);
        System.out.println("Item " + itemName);
        System.out.println("Price: "+ Catalog.currency + Math.round(itemPrice*itemQuantity));
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Payment type: " + paymentType);
        System.out.println("Payment ID: " + paymentID);
        System.out.println( "=============================");
    }
}
