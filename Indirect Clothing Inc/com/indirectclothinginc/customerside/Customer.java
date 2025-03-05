package indirectclothinginc.customerside;

import java.util.Scanner;

public class Customer {
    private String userName;
    private String userAddress;
    private String userContactNumber;

    public String getUserName(){
        return userName;
    }
    public String getUserAddress(){
        return userAddress;
    }
    public String getUserContactNumber(){
        return userContactNumber;
    }

    public void customerInfo(Scanner input){
        System.out.print("Enter name: ");
        userName = input.nextLine();

        System.out.print("Enter Address: ");
        userAddress = input.nextLine();

        System.out.print("Enter contact number: ");
        userContactNumber = input.nextLine();
    }
}
