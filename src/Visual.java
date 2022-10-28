import javax.swing.JOptionPane;

public class Visual {
    void showMessageDialog(){JOptionPane.showMessageDialog(
            null,
            "Bad input !",
            "ERROR",
            JOptionPane.ERROR_MESSAGE);
    }
    void showTerminateDialog(){
        JOptionPane.showMessageDialog(
                null,
                "Application was terminated.",
                "Cancelled",
                JOptionPane.ERROR_MESSAGE);
        System.out.println("Application terminated.");
        System.exit(0);
    }
    String showInputDialog(String info, String title) {
        return JOptionPane.showInputDialog(null,
                info,
                title,
                JOptionPane.QUESTION_MESSAGE);
   }
}
