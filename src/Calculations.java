import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Calculations {
    private float netPrice;
    private float vat;
    private float vatValue;
    private int numOfItems;
    private float totalNet;
    private int prodCount=0;
    private final CollectData dataCollected = new CollectData();
    ArrayList<DataContainer> sigleProduct = new ArrayList<DataContainer>();

    void terminalPart(){
        System.out.println("Program calculating value of a bill.");
        System.out.println("====================================");
        calcSingleProduct();
    }
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
                vatValue = (vat/100)*totalNet;
                finalBill();
    }
   void finalBill() {
               float billNet = 0;
               float billVAT = 0;
               final DataContainer dataSet = new DataContainer(prodCount,netPrice,vat, vatValue,numOfItems,totalNet);
               sigleProduct.add(dataSet);
               int contDialog = JOptionPane.showConfirmDialog(null,   // YES=0  NO=1
                                                           "Do You want to add next item ?",
                                                           "Next item", JOptionPane.YES_NO_OPTION,
                                                           JOptionPane.QUESTION_MESSAGE);
               if(contDialog ==0){
                   calcSingleProduct();
               } else {
                   for (DataContainer dataset: sigleProduct) { // Printing all purchases AND summing VAT and net amounts.
                       billNet+=dataset.totalNet();
                       billVAT+=dataset.vatVal();
                       dataset.toString();
                       System.out.println("-------------------");
                   }
                   System.out.println("Sum of all products:");
                   System.out.println("--------------------");
                   System.out.println("Net value of all products : " + billNet);
                   System.out.println("VAT value of all products : " + billVAT);
                   System.out.println("========================================");
                   System.out.println("\n This is the end of the program.");
               }
    }
}