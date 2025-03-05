package indirectclothinginc.inventoryside;

import indirectclothinginc.catalog.Catalog;

public class Order {
    public byte orderQuantity;
    public byte itemSize;
    public byte itemSizeChoice;

    public String itemSize(Byte itemSizeChoice){
        return switch (itemSize) {
            case 1:
                "Small";
            case 2: 
                "Medium";
            case 3:
                "Large";
            case 4:
                "XL";
            default:
                " ";
        }
    }

    public void printReceipt(String userName, String userAddress, String userContactNumber, String selectedItemName,String itemSize, double selectedItemPrice, byte orderQuantity, String paymentType, int paymentID){
        System.out.println("\nReceipt");
        System.out.println("Name:"+ userName);
        System.out.println("Address: " + userAddress);
        System.out.println("Contact number: "+userContactNumber);
        System.out.println("Item: " + selectedItemName);
        System.out.println("Item size: " + itemSize);
        System.out.println("Price: "+ Catalog.currency + selectedItemPrice*orderQuantity);
        System.out.println("Quantity: " + orderQuantity);
        System.out.println("Payment type: " + paymentType);
        System.out.println("Payment ID: " + paymentID);
    }
}
