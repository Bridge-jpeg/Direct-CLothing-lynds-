public class Order {
    String itemName;
    int itemQuantity;
    double itemPrice;

    void printReceipt(String userName, String userAddress, String userContactNumber, String itemName, double itemPrice, int itemQuantity, String paymentType, int paymentID){
        System.out.println(" ");
        System.out.println("===========Receipt===========");
        System.out.println("Name:"+ userName);
        System.out.println("Address: " + userAddress);
        System.out.println("Contact number: "+userContactNumber);
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + itemPrice*itemQuantity);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Payment type: " + paymentType);
        System.out.println("Payment ID: " + paymentID);
        System.out.println( "=============================");
    }
}
