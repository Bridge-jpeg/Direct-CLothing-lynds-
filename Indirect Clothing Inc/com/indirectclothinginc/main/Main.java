package indirectclothinginc.main;

import indirectclothinginc.catalog.Catalog;
import indirectclothinginc.catalog.SeasonCatalog;
import indirectclothinginc.customerside.Customer;
import indirectclothinginc.customerside.Payment;
import indirectclothinginc.inventoryside.Inventory;
import indirectclothinginc.inventoryside.Order;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        Inventory inventory = new Inventory();
        Order order = new Order();
        Payment payment = new Payment();
/*
        Application of polymorphism
        (Item name, Item price, Item stock, Item Description, isCurrent (If item is discounted))
*/
//      Items for Spring catalog
        Catalog s1item1 = new SeasonCatalog("Linen Button-Down Shirt", 2800, (byte) 25, "Tailored for warmth and elegance", true);
        Catalog s1item2 = new SeasonCatalog("Slim-Fit Chino Pants", 3360, (byte) 30, "Versatile and stylish pants for any occasion.", true );
        Catalog s1item3 = new SeasonCatalog("Casual Loafers", 4480, (byte)0, "Sleek slip-on shoes for casual and semi-formal looks.", true);

//      Items for Summer Catalog
        Catalog s2item1 = new SeasonCatalog("Short-Sleeve Cuban Collar Shirt", 2240, (byte)20, "Relaxed fit with bold prints for sunny days.", false);
        Catalog s2item2 = new SeasonCatalog("Short-Tailored Shorts", 2800, (byte)25, "Knee-length, breathable shorts for summer comfort.", false);
        Catalog s2item3 = new SeasonCatalog("Espadrilles", 3360, (byte)15,"Lightweight slip-on shoes, great for the beach.", false);

//		Items for Autumn Catalog
        Catalog s3item1 = new SeasonCatalog("Wool-Blend Overshirt", 5040.0, (byte)18, "Thick and cozy shirt, perfect for layering.", false);
        Catalog s3item2 = new SeasonCatalog("Dark Denim Jeans", 4200, (byte)22, "Classic, study jeans for cooler days.", false);
        Catalog s3item3 = new SeasonCatalog("Leather Chelsea Boots", 7840, (byte)12, "Sleek boots that elevate any outfit.", false);

//		Items for Winter Catalog
        Catalog s4item1 = new SeasonCatalog("Wool Overcoat", 10080, (byte)10, "Tailored coat for warmth and elegance.", false);
        Catalog s4item2 = new SeasonCatalog("Thermal Knit Sweater", 3920, (byte)20, "Soft, insulating sweater for cold weather.", false);
        Catalog s4item3 = new SeasonCatalog("Leather Lace-Up Boots", 6720, (byte)15, "Rugged, insulated boots for winter durability.", false);

/*
            For displaying catalogs
            Why can parent class be used as return type? Polymorphism
*/
        Catalog[] springCatalog = {s1item1, s1item2, s1item3};
        Catalog[] summerCatalog = {s2item1, s2item2, s2item3};
        Catalog[] autumnCatalog = {s3item1, s3item2, s3item3};
        Catalog[] winterCatalog = {s4item1, s4item2, s4item3};

        customer.customerInfo(input); // Asking customer for their information

        System.out.println("\nCatalogs: ");
        System.out.println("1: Spring Catalog - Fresh and Casual");
        System.out.println("2: Summer Catalog - Hot Clothes ");
        System.out.println("3: Autumn Catalog - Chilly Clothes ");
        System.out.println("4: Winter Catalog - Warm Clothes");
        System.out.print("Pick a catalog: ");
        byte chooseACatalog = input.nextByte();

        switch (chooseACatalog) {
            //Displays Spring Catalog
            case 1:
                inventory.showCatalog("\nSpring Collection: Fresh and Casual", springCatalog, input);
                break;

            // Displays Summer Catalog
            case 2:
                inventory.showCatalog("\nSummer Collection: Cool and Breezy", summerCatalog, input);
                break;

            //Displays Autumn Catalog
            case 3:
                inventory.showCatalog("\nAutumn Collection: Warm and Stylish", autumnCatalog, input);
                break;

            //Displays Winter Catalog
            case 4:
                inventory.showCatalog("\nWinter Collection: Cozy and Functional", winterCatalog, input);
                break;
            default: System.exit(404);
        }

        System.out.print("\nSizes:\n1: S\n2: M\n3. L\n4: Xl\nPick a size: ");
        order.itemSizeChoice = input.nextByte();
        System.out.print("Enter item quantity: ");
        order.orderQuantity = input.nextByte();

//      For payment
        payment.paymentProcess(input);

        order.printReceipt(customer.getUserName(), customer.getUserAddress(), customer.getUserContactNumber(),inventory.selectedItemName, order.itemSize(order.itemSizeChoice), inventory.selectedItemPrice, order.orderQuantity, payment.paymentType(payment.modeOfPayment), payment.paymentID);
        input.close();
    }
}
    
    
    
 
        