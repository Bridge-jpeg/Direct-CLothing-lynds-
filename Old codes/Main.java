import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        Inventory inventory = new Inventory();
        Order order = new Order();
        Payment payment = new Payment();
        Discount discount = new Discount();

        // To be implemented
        // Items for Spring catalog (Item name, Item price, Item stock, Item Description)
        SpringCatalog s1item1 = new SpringCatalog("1: Linen Button-Down Shirt", 2800 , 25, "Tailored for warmth and elegance");
        SpringCatalog s1item2 = new SpringCatalog("2: Slim-Fit Chino Pants", 3360, 30, "Versatile and stylish pants for any occasion.");
        SpringCatalog s1item3 = new SpringCatalog("3: Casual Loafers", 4480, 0,"Sleek slip-on shoes for casual and semi-formal looks.");

//      Items for Summer Catalog (Item name, Item price, Item stock, Item Description)
        SummerCatalog s2item1 = new SummerCatalog("1: Short-Sleeve Cuban Collar Shirt", 2240, 20,"Relaxed fit with bold prints for sunny days.");
		SummerCatalog s2item2 = new SummerCatalog("2: Short-Tailored Shorts", 2800, 25, "Knee-length, breathable shorts for summer comfort.");
		SummerCatalog s2item3 = new SummerCatalog("3: Espadrilles", 3360, 15, "Lightweight slip-on shoes, great for the beach.");

//		Items for Autumn Catalog
        AutumnCatalog s3item1 = new AutumnCatalog("1: Wool-Blend Overshirt", 5040, 18 ,"Thick and cozy shirt, perfect for layering.");
        AutumnCatalog s3item2 = new AutumnCatalog("2: Dark Denim Jeans", 4200, 22,"Classic, study jeans for cooler days.");
        AutumnCatalog s3item3 = new AutumnCatalog("3: Leather Chelsea Boots", 7840, 12 ,"Sleek boots that elevate any outfit.");

//		Items for Winter Catalog
        WinterCatalog s4item1 = new WinterCatalog("1: Wool Overcoat", 10080, 10,"Tailored coat for warmth and elegance.");
        WinterCatalog s4item2 = new WinterCatalog("2: Thermal Knit Sweater", 3920, 20,"Soft, insulating sweater for cold weather.");
        WinterCatalog s4item3 = new WinterCatalog("3: Leather Lace-Up Boots", 6720, 15,"Rugged, insulated boots for winter durability.");


        SpringCatalog [] s1 = {s1item1, s1item2, s1item3};
        SummerCatalog [] s2 = {s2item1, s2item2, s2item3};
        AutumnCatalog [] s3 = {s3item1, s3item2, s3item3};
        WinterCatalog [] s4 = {s4item1, s4item2, s4item3};


//       Test variables, to be transferred to other class
        
        Byte chooseACatalog;
        Byte chooseItem;

//      For entering customer information
//      To be printed on the receipt
        System.out.println("====== User form ======");
        System.out.print("Enter name: ");
        customer.userName = input.nextLine();

        System.out.print("Enter Address: ");
        customer.userAddress = input.nextLine();

        System.out.print("Enter contact number: ");
        customer.userContactNumber = input.nextLine();;
        System.out.println("=======================");

        

        System.out.println("\n1: Spring Catalog - Fresh and Casual \uD83C\uDF3F\uD83C\uDF1E");
        System.out.println("\n2: Winter Catalog - Warm Clothes");
        System.out.println("\n3: Summer Catalog - Hot Clothes ");
        System.out.println("\n4: Autumn Catalog - Chilly Clothes ");
        System.out.print("\nPick a catalog: ❄ \uFE0F\uD83E\uDDE5");
        chooseACatalog = input.nextByte();

        switch (chooseACatalog){
        //Displays Spring Catalog
            case 1:
                System.out.println("\n=== Spring Collection: Fresh and Casual === \n");
                for (SpringCatalog i: s1){
                    i.itemInfo();
                }
                System.out.println("==============================================");
                System.out.print("Choose Item: ");
                chooseItem = input.nextByte();
                    
                switch(chooseItem){
                    case 1:
                        System.out.println(s1item1.getItemName());
                        inventory.checkStock(s1item1.getItemStock());
                        break;
                    case 2:
                        System.out.println(s1item2.getItemName());
                        inventory.checkStock(s1item2.getItemStock());
                        break;
                    case 3:
                        System.out.println(s1item3.getItemName());
                        inventory.checkStock(s1item3.getItemStock());
                        Byte preOrder = input.nextByte();
                        inventory.ifPreOrder(preOrder);
                        break;
                }
                break;
            // Displays Summer Catalog
            case 2:
                System.out.println("\n=== Summer Collection: Cool and Breezy === \n");
                for (SummerCatalog i:s2){
                    i.itemInfo();
                }
                System.out.println("==============================================");
                System.out.print("Choose Item: ");
                chooseItem = input.nextByte();
                switch(chooseItem){
                    case 1:
                        System.out.println(s2item1.getItemName());
                        inventory.checkStock(s2item1.getItemStock());
                        break;
                    case 2:
                        System.out.println(s2item2.getItemName());
                        inventory.checkStock(s2item2.getItemStock());
                        break;
                    case 3:
                        System.out.println(s2item3.getItemName());
                        inventory.checkStock(s2item3.getItemStock());
                        break;
                }
                break;
            //Displays Autumn Catalog
            case 3:
                System.out.println("\n=== Autumn Collection: Warm and Stylish === \n");
                for (AutumnCatalog i: s3){
                    i.itemInfo();
                }
                System.out.println("==============================================");
                System.out.print("Choose Item: ");
                chooseItem = input.nextByte();
                switch(chooseItem){
                    case 1:
                        System.out.println(s3item1.getItemName());
                        inventory.checkStock(s3item1.getItemStock());
                        break;
                    case 2:
                        System.out.println(s3item2.getItemName());
                        inventory.checkStock(s3item2.getItemStock());
                        break;
                    case 3:
                        System.out.println(s3item3.getItemName());
                        inventory.checkStock(s3item3.getItemStock());
                        break;
                }
                break;
            //Displays Winter Catalog
            case 4:
                System.out.println("\n=== Winter Collection: Cozy and Functional === \n");
                for (WinterCatalog i: s4){
                    i.itemInfo();
                }
                System.out.println("==============================================");
                System.out.print("Choose Item: ");
                chooseItem = input.nextByte();
                switch(chooseItem){
                    case 1:
                        System.out.println(s4item1.getItemName());
                        inventory.checkStock(s4item1.getItemStock());
                        break;
                    case 2:
                        System.out.println(s4item2.getItemName());
                        inventory.checkStock(s4item2.getItemStock());
                        break;
                    case 3:
                        System.out.println(s4item3.getItemName());
                        inventory.checkStock(s4item3.getItemStock());
                        break;
                }
               
                break;
        } 

        
        System.out.print("Enter item quantity: ");
        order.itemQuantity = input.nextByte();
        discount.isDiscount(true, s1item1.getItemPrice());

        System.out.println("\n===== Payment =====");
        System.out.print("1: Cash on Delivery\n2: Credit Card\n3: Pay by Check (eCheck)\nChoose mode of payment: ");
        payment.modeOfPayment = input.nextInt();
    
        switch (payment.modeOfPayment){
            case 1:
                break;
            case 2:
                System.out.print("Enter bank name: ");
                input.nextLine();
                payment.bankName = input.nextLine();
    
                System.out.print("Enter Credit card number: ");
                payment.accountNumber = input.nextLine();
                break;
            case 3:
                System.out.print("Enter bank name: ");
                input.nextLine();
                payment.bankName = input.nextLine();

                System.out.print("Enter Checking account number: ");
                payment.accountNumber = input.nextLine();
                break;
        }
        order.printReceipt(customer.userName, customer.userAddress, customer.userContactNumber, s1item1.getItemName()
        , s1item1.getItemPrice(), order.itemQuantity, payment.paymentType(payment.modeOfPayment, payment.bankName, payment.accountNumber), payment.paymentID);
        
        input.close();
    }
    
}
    
    
    
 
        