public record DataContainer(int prodCount, float netPrice, float vat, float vatVal, int numOfItems, float totalNet) {

    public DataContainer(int prodCount, float netPrice, float vat, float vatVal, int numOfItems, float totalNet) {
        this.vatVal = vatVal;
        this.prodCount = prodCount;
        this.netPrice = netPrice;
        this.vat = vat;
        this.numOfItems = numOfItems;
        this.totalNet = totalNet;
    }

    @Override
    public String toString() {
        System.out.println("Product No : "+ prodCount);
        System.out.println("Number of items : "+ numOfItems);
        System.out.println("Net price : "+ netPrice);
        System.out.println("VAT % : "+ vat +" %");
        System.out.println("Total VAT value : " + vatVal);
        System.out.println("Total net : "+ totalNet);
        return "";
    }
}
