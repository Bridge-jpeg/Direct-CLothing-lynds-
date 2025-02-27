public class Inventory {
    public int chooseItem;
    public void displayCatalog(String[] String, double[] doubles, boolean currentCatalog){
        for(int i = 0, itemNumber = 1; i<String.length; i++, itemNumber++){
            if (currentCatalog) {
                System.out.println(itemNumber + ". " + String[i] + ": PHP " + Math.round(doubles[i]*.7));
            }
            else {
                System.out.println(itemNumber + ". " + String[i] + ": PHP " + doubles[i]);
            }
        }
    }
    public boolean ifInStock(int chooseItem, int [] ints){
        int showOrder = chooseItem - 1;
        boolean inStock;
        inStock = ints[showOrder] != 0;
        return inStock;
    }

    public String showItemInfo(int chooseItem, String[] String , int []ints){
        int showOrder = chooseItem - 1;
        return String [showOrder] +"\nIn stock: "+ ints[showOrder];
    }
    public String showItemName(int chooseItem, String[] String){
        int showOrder = chooseItem - 1;
        return String [showOrder];
    }
    public double showItemPrice(int chooseItem, double[] doubles){
        int showItemPrice = chooseItem - 1;
        return doubles[showItemPrice];
    }
}
