import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        SpringCatalog springCatalog = new SpringCatalog();
        Inventory inventory = new Inventory();
        Order order = new Order();
        Payment payment = new Payment();

        // To be implemented
        // Items for Spring catalog (Item name, Item price, Item stock, Item Description)
        SpringCatalog item1 = new SpringCatalog("1: Linen Button-Down Shirt", 2800 , 25, "Tailored for warmth and elegance");
        SpringCatalog item2 = new SpringCatalog("2: Slim-Fit Chino Pants", 3360, 30, "Versatile and stylish pants for any occasion.");
        SpringCatalog item3 = new SpringCatalog("3: Casual Loafers", 4480, 0,"Sleek slip-on shoes for casual and semi-formal looks.");
/* 
//      Items for Summer Catalog (Item name, Item price, Item stock, Item Description)
        SummerCatalog item4 = new SummerCatalog("4: Short-Sleeve Cuban Collar Shirt", 2240, 20,"Relaxed fit with bold prints for sunny days.");
		SummerCatalog item5 = new SummerCatalog("5: Short-Tailored Shorts", 2800, 25, "Knee-length, breathable shorts for summer comfort.");
		SummerCatalog item6 = new SummerCatalog("6: Espadrilles", 3360, 15, "Lightweight slip-on shoes, great for the beach.");

//		Items for Autumn Catalog
        AutumnCatalog item7 = new AutumnCatalog("7: Wool-Blend Overshirt", 5040, 18 ,"Thick and cozy shirt, perfect for layering.");
        AutumnCatalog item8 = new AutumnCatalog("8: Dark Denim Jeans", 4200, 22,"Classic, study jeans for cooler days.");
        AutumnCatalog item9 = new AutumnCatalog("9: Leather Chelsea Boots", 7840, 12 ,"Sleek boots that elevate any outfit.");

//		Items for Winter Catalog
        WinterCatalog item10 = new WinterCatalog("10: Wool Overcoat", 10080, 10,"Tailored coat for warmth and elegance.");
        WinterCatalog item11 = new WinterCatalog("11: Thermal Knit Sweater", 3920, 20,"Soft, insulating sweater for cold weather.");
        WinterCatalog item12 = new WinterCatalog("12: Leather Lace-Up Boots", 6720, 15,"Rugged, insulated boots for winter durability.");


        SpringCatalog [] items = {item1, item2, item3};
        SummerCatalog [] items2 = {item4, item5, item6};
        AutumnCatalog [] items3 = {item7, item8, item9};
        WinterCatalog [] items4 = {item10, item11, item12};
*/

//       Test variables, to be transferred to other class
        int testChooseGender;
        int chooseACatalog;

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

        System.out.println("1: Male\n2: Female");
        System.out.print("Choose: ");
        testChooseGender = input.nextInt();

        if (testChooseGender == 1){
            System.out.println("\n1: Spring Catalog - Fresh and Casual \uD83C\uDF3F\uD83C\uDF1E");
            System.out.println("\n2: Winter Catalog - Warm Clothes");
            System.out.println("\n3: Summer Catalog - Hot Clothes ");
            System.out.println("\n4: Autumn Catalog - Chilly Clothes ");
            System.out.print("Pick a catalog: ❄ \uFE0F\uD83E\uDDE5");
            chooseACatalog = input.nextInt();

            switch (chooseACatalog){
                case 1:
                    System.out.println(" ");
                    // prints the lines 1. Linen Button-Down Shirt: PHP 1960
                    // 2. Slim-Fit Chino Pants: PHP 2352
                    // 3. Casual Loafers: PHP 3136
                    // Choose an item: 1
                    inventory.displayCatalog(springCatalog.getItemName(), springCatalog.getItemPrice(), springCatalog.isCurrent(), springCatalog.getItemDescription());
                    System.out.print("Choose an item: ");
                    inventory.chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.showItemInfo(inventory.chooseItem, testCatalog.getSpringCatalogItem(), testCatalog.getSpringCatalogItemStock()));
                    
                    order.itemName = inventory.showItemName(inventory.chooseItem, testCatalog.getSpringCatalogItem());
                    order.itemPrice = inventory.showItemPrice(inventory.chooseItem, testCatalog.getSpringCatalogPrice());

                    if(inventory.ifInStock(inventory.chooseItem, testCatalog.getSpringCatalogItemStock())){
                        System.out.print("Enter item quantity: ");
                        order.itemQuantity = input.nextInt();
                        System.out.println("Proceed to check out");
                        break;
                }
                case 2:
                    System.out.println(" ");

                    
                case 3:


                case 4:
                    System.out.println("This item is out of stock, do you want to pre order?");


            }
        }
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
        order.printReceipt(customer.userName, customer.userAddress, customer.userContactNumber, order.itemName, order.itemPrice, order.itemQuantity, payment.paymentType(payment.modeOfPayment, payment.bankName, payment.accountNumber), payment.paymentID);
    }
}
