import javax.swing.JOptionPane;
public class CollectData {
    private final Visual visual = new Visual();
    float collNetPriceFromDialog(){
        String str =visual.showInputDialog("Insert net price :");
        if(str.matches("[-+]?[0-9]*\\.?[0-9]+")) {// <-- RegEx to validate float
            return Float.parseFloat(str);
        } else {
            visual.showMessageDialog();
            return 0 ;
        }
    }
    float collectVAT(){
        String str =visual.showInputDialog("Insert VAT:");
        if(str.matches("[-+]?[0-9]*\\.?[0-9]+")) {// <-- RegEx to validate float
            return Float.parseFloat(str);
        } else {
            visual.showMessageDialog();
            return 0;
        }
    }
    float collectNumOfItems(){
        String str =visual.showInputDialog("Insert number of items :");
        if(str.matches("-?(0|[1-9]\\d*)")) {// <-- RegEx to validate integer
            return Float.parseFloat(str);
        } else {
            visual.showMessageDialog();
        }
        return 0;
    }
    void terminalPart(){
        System.out.println("Program calculating value of a bill.");
        System.out.println("====================================");
    }
}
