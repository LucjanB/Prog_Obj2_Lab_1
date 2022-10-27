
import java.util.*;
import javax.swing.JOptionPane;
public class Visual {
    void showMessageDialog(String message){JOptionPane.showMessageDialog(null, message);}
    void showContinueMessage(String message){JOptionPane.showConfirmDialog(null,
            "Do You want to add more items ?",
            "More ?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);}
    String showInputDialog(String info) {
        return JOptionPane.showInputDialog(null,info,JOptionPane.PLAIN_MESSAGE);
   }

}
