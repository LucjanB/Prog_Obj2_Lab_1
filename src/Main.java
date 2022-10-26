
public class Main {
    public static void main(String[] args)
    {

        Visual vis = new Visual();
        CollectData dataColl = new CollectData();
        Calculations calcPrice = new Calculations();
        dataColl.terminalPart();
        calcPrice.calcSingleProduct();

    }
}