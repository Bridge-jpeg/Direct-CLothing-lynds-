package indirectclothinginc.customerside;

import java.util.Scanner;

public class Payment {
    public byte modeOfPayment;
    public String bankName;
    public String accountNumber;
    public int paymentID = (int)(Math.random()*2147483647);

    public String paymentType(byte modeOfPayment){
        return switch (modeOfPayment) {
            case 1:
                "Cash on Delivery";
            case 2:
                "Credit\nAccount number: " + accountNumber;
            case 3:
                "Pay by check (eCheck)\nChecking account number: " + accountNumber;
            default:
                " ";
        }
    }
    public void paymentProcess(Scanner input){
        System.out.println("\nPayment");
        System.out.print("1: Cash on Delivery\n2: Credit Card\n3: Pay by Check (eCheck)\nChoose mode of payment: ");

        modeOfPayment = input.nextByte();
        switch (modeOfPayment) {
            case 1:
                break;
            case 2:
                System.out.print("Enter bank name: ");
                input.nextLine();
                bankName = input.nextLine();
                System.out.print("Enter Credit card number: ");
                accountNumber = input.nextLine();
                break;
            case 3:
                System.out.print("Enter bank name: ");
                input.nextLine();
                bankName = input.nextLine();

                System.out.print("Enter Checking account number: ");
                accountNumber = input.nextLine();
                break;
            default: System.out.println("Invalid Payment Type!");
        }
    }
}
