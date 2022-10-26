public class Calculations {
    private float netPrice;
    private float vat;
    private int numOfItems;
    private int counter;
    private float sumOfAllProducts;
    private final CollectData dataCollected = new CollectData();

    float calcSingleProduct() {
        float netpice = 0;
        float vat;
        int numOfItems;

                netpice = dataCollected.collNetPriceFromDialog();
                if(netpice<=0){
                    dataCollected.collNetPriceFromDialog();
                }
                System.out.println("Net price: " + netpice);


                vat = dataCollected.collectVAT();
                System.out.println("VAT: " + vat);


                numOfItems = (int) dataCollected.collectNumOfItems();
                System.out.println("Number of items " + numOfItems);



            return netpice;
    }
}
