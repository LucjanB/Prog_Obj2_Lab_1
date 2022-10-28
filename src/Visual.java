import javax.swing.JOptionPane;

public class Visual {
    void showMessageDialog(){JOptionPane.showMessageDialog(null,"Bad input !","ERROR",JOptionPane.ERROR_MESSAGE);}
    String showInputDialog(String info) {
        return JOptionPane.showInputDialog(null,info,JOptionPane.PLAIN_MESSAGE);
   }
}
