
public class CollectData {
    private final Visual visual = new Visual();
   // private final Calculations calcPrice = new Calculations();
    float collNetPriceFromDialog(){
        String str =visual.showInputDialog("Insert net price :");// !!!!!!!!!!!!!!!!!!!!
        if(str.matches("-?(0|[1-9]\\d*)")) {// !!!!!!!!!!!!!!!!!!!!
            return Float.parseFloat(str);
        } else {
            System.out.println("Wrong value");
        }
        return 0;
    }
    float collectVAT(){
        String str =visual.showInputDialog("Insert VAT:");// !!!!!!!!!!!!!!!!!!!!
        if(str.matches("-?(0|[1-9]\\d*)")) {// !!!!!!!!!!!!!!!!!!!!
            return Float.parseFloat(str);
        } else {
            System.out.println("Wrong value");
            collectVAT();
        }
        return 0;
    }
    float collectNumOfItems(){
        String str =visual.showInputDialog("Insert number of items :");// !!!!!!!!!!!!!!!!!!!!
        if(str.matches("-?(0|[1-9]\\d*)")) {// !!!!!!!!!!!!!!!!!!!!
            return Float.parseFloat(str);
        } else {
            System.out.println("Wrong value");
        }
        return 0;
    }
    void badInput(){
        visual.showMessageDialog("Bad value !");
    }
    void terminalPart(){
        System.out.println("Program calculating value of a bill.");
        System.out.println("====================================");
        //calcPrice.calcSingleProduct();
    }
}
