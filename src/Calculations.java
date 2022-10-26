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
        while (true) {
            try {
                netpice = dataCollected.collNetPriceFromDialog();
                System.out.println("Net price: " + netpice);
            } catch (NumberFormatException ex) {
                dataCollected.badInput();
                break;
            }
            try {
                vat = dataCollected.collectVAT();
                System.out.println("VAT: " + vat);
            } catch (NumberFormatException ex) {
                dataCollected.badInput();
                break;
            }
            try {
                numOfItems = (int) dataCollected.collectNumOfItems();
                System.out.println("Number of items " + numOfItems);
                break;
            }  catch(NumberFormatException ex) {
                dataCollected.badInput();
                break;
            }
        }
            return netpice;
    }
}
