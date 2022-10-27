public record DataContainer(int prodCount,float netPrice, float vat, int numOfItems, float totalNet) {

    public DataContainer(int prodCount,float netPrice, float vat, int numOfItems, float totalNet) {
        this.prodCount = prodCount;
        this.netPrice = netPrice;
        this.vat = vat;
        this.numOfItems = numOfItems;
        this.totalNet = totalNet;
    }

    @Override
    public String toString() {
        System.out.println("Product No : "+ prodCount);
        System.out.println("Net : "+ netPrice);
        System.out.println("VAT : "+ vat);
        System.out.println("Number : "+ numOfItems);
        System.out.println("Total  : "+ totalNet);
        return "";
    }
}
