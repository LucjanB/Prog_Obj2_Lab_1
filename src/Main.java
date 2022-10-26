
public class Main {
    public static void main(String[] args)
    {
        Calculations calc = new Calculations();
        Visual vis = new Visual();
        CollectData dataColl = new CollectData();
        Calculations calcPrice = new Calculations();
        dataColl.terminalPart();
        calcPrice.calcSingleProduct();

    }
}