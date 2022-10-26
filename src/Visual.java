
import java.util.*;
import javax.swing.JOptionPane;
public class Visual {
   void showMessageDialog(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    String showInputDialog(String info) {
        return JOptionPane.showInputDialog(null,info,JOptionPane.PLAIN_MESSAGE);
   }
}
