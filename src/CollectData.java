
public class CollectData {
    private final Visual visual = new Visual();
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
        return Float.parseFloat(visual.showInputDialog("Insert VAT :"));
    }
    float collectNumOfItems(){
        return Integer.parseInt(visual.showInputDialog("Insert number of items :"));
    }
    void badInput(){
        visual.showMessageDialog("Bad value !");
    }
    void terminalPart(){
        System.out.println("Program calculating value of a bill.");
        System.out.println("====================================");
    }
}
