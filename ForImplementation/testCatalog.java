public class testCatalog extends currentCatalog{
    @Override
    public boolean isCurrent() {
        return true;
    }


    private static String[] springCatalogItem = {"Linen Button-Down Shirt", "Slim-Fit Chino Pants", "Casual Loafers"};
    private static double []springCatalogPrice ={2800, 3360, 4480};
    private static int [] springCatalogItemStock = {25, 30, 0};

    public static String[] getSpringCatalogItem(){return springCatalogItem;};
    public static double[] getSpringCatalogPrice(){return springCatalogPrice;};
    public static int[] getSpringCatalogItemStock(){return springCatalogItemStock;};


}
