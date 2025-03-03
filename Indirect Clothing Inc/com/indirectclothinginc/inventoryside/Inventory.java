package indirectclothinginc.inventoryside;

public class Inventory {

    public void setNameAndPrice(String String, Integer ints){
        System.out.println(String);
        checkStock(ints);
    }

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
/*
    method (int){
        if yes
            send supplier
            bytes dateOfArrival = dateOfArrival + 5
            return successfully pre ordered
        else
            system.exit()
    }


 */


}

 