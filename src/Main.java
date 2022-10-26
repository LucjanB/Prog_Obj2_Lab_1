
public class Main {
    public static void main(String[] args)
    {
        Calculations calc = new Calculations();
        Visual vis = new Visual();
        String mes = vis.showInputPane();
        vis.showMessageDialog(mes);
    }
}