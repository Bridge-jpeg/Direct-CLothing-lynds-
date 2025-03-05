package indirectclothinginc.inventoryside;
import indirectclothinginc.catalog.Catalog;
import java.util.Scanner;

public class Inventory {
    public String selectedItemName;
    public double selectedItemPrice;

    public void showCatalog(String StringCatalogName, Catalog [] catalogs, Scanner input){
        byte itemNumber = 1;
        System.out.println(StringCatalogName);
        for (Catalog i : catalogs){
            System.out.print("Item "+ itemNumber + ": ");
            i.itemInfo();
            itemNumber ++;
        }

        System.out.print("Choose Item: ");
        byte chooseItem = input.nextByte();
        Catalog showItem = catalogs [chooseItem - 1]; //choose item - 1 since index starts at 0, so needs to be readjusted  by - 1
        System.out.println(showItem.getItemName());
        if (showItem.getItemStock() <= 0){
            System.out.println("Out of stock, Pre order? ");
            System.out.println("1: Yes\n2: No");
            System.out.print("Enter your Choice: ");
        }
        else {
            System.out.println("Proceed to payment");
        }
        selectedItemName = showItem.getItemName();
        selectedItemPrice = showItem.getItemPrice();
    }

}

 