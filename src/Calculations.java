public class Calculations {
    private float netPrice;
    private float vat=0;
    private int numOfItems;
    private int counter;
    private float sumOfAllProducts;
    private final CollectData dataCollected = new CollectData();

    void calcSingleProduct() {
        float netpice;
        float vat =0;
        int numOfItems;
                do {
                    netpice = dataCollected.collNetPriceFromDialog();
                }while (netpice<=0);



                do {
                    vat = dataCollected.collectVAT();
                } while (vat <= 0);
                           // vat = dataCollected.collectVAT();

                do {
                    numOfItems = (int) dataCollected.collectNumOfItems();
                } while (numOfItems <= 0);

                    System.out.println("Net price: " + netpice);
                    System.out.println("VAT: " + vat);
                    System.out.println("Number of items " + numOfItems);

    }
}
