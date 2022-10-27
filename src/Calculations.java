import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Calculations {
    private float netPrice;
    private float vat=0;
    private int numOfItems;
    private float totalNet;
    private int prodCount=0;
    private final CollectData dataCollected = new CollectData();
    private final Visual visual = new Visual();
    ArrayList<DataContainer> sigleProduct = new ArrayList<DataContainer>();
    void calcSingleProduct() {

                do {
                    netPrice = dataCollected.collNetPriceFromDialog();
                }while (netPrice<=0);

                do {
                    vat = dataCollected.collectVAT();
                } while (vat <= 0);

                do {
                    numOfItems = (int) dataCollected.collectNumOfItems();
                } while (numOfItems <= 0);
                prodCount++;
                totalNet = netPrice*numOfItems;

                finalBill();
    }
   void finalBill() {
               final DataContainer dataSet = new DataContainer(prodCount,netPrice, vat, numOfItems, totalNet);

               sigleProduct.add(dataSet);
   int contDialog = JOptionPane.showConfirmDialog(null,   // YES=0  NO=1
                                               "Do You want to add next item ?",
                                               "Next item", JOptionPane.YES_NO_OPTION,
                                               JOptionPane.QUESTION_MESSAGE);
               if(contDialog ==0){
                   calcSingleProduct();
               } else {
                   for (DataContainer dataset: sigleProduct) {
                       dataset.toString();
                       System.out.println("-------------------");
                   }
                   System.out.println("\n This is the end of the program.");
               }
    }
}
