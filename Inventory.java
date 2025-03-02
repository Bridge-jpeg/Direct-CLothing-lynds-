
public class Inventory {
    public void checkStock (Integer ints){
        if (ints <= 0){
            System.out.println("Out of stock, Pre order? ");
            System.out.println("1: Yes\n2: No");
            System.out.print("Enter your Choice: ");
        }
        else{
            System.out.println("Proceed to payment");
        }
    }
    public void ifPreOrder(Byte bytes){
        if (bytes == 2){
            System.exit(0);
        }
    }
}
 