public class Inventory {
    public int chooseItem;
    public void displayCatalog(String[] String, double [] doubles, boolean currentCatalog, String description){
        for(int i = 0, itemNumber = 1; i<String.length; i++, itemNumber++){
            if (CatalogForImplementation){
                System.out.println(itemNumber + ". " + String[i] + ": PHP " + Math.round(doubles[i]*.7) + description);
            }
            else {
                System.out.println(itemNumber + ". " + String[i] + ": PHP " + doubles[i] + description );
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
    public String showItemdescription (int chooseItem, String[] String) {
        int showItemdescription = chooseItem - 1;
        return String [showItemdescription];
    }

}
