public class Discount {
    double itemPrice;

    public double isDiscount(boolean isCurrent, double itemPrice) {
        if (isCurrent) {
            itemPrice = itemPrice * .70; //70% discount
            return itemPrice;
        } else {
        return itemPrice;
        }
    }
}
