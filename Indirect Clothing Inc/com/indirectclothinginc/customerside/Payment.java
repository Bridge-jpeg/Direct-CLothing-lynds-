package indirectclothinginc.customerside;

public class Payment {
    public int modeOfPayment;
    public String bankName;
    public String accountNumber;
    public int paymentID = (int)(Math.random()*2147483647);

    public String paymentType(int modeOfPayment, String bankName, String accountNumber){
        switch (modeOfPayment){
            case 1:
                return "Cash on Delivery";
            case 2:
                return "Credit\nAccount number: " +accountNumber;
            case 3:
                return "Pay by check (eCheck)\nChecking account number: "+ accountNumber;
        }
        return " ";
    }

}
