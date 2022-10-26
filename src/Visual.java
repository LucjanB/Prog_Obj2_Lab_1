
import java.util.*;
import javax.swing.JOptionPane;
public class Visual {
    String showInputPane(){
        String myInputStr = JOptionPane.showInputDialog("Message","Data Input");
        System.out.println(myInputStr);

        return myInputStr;
    }
    void showMessageDialog(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
