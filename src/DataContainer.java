public record DataContainer(int prodCount, float netPrice, float vat, float vatVal, int numOfItems, float totalNet) {
    @Override
    public String toString() {
        System.out.println("Product No : "+ prodCount);
        System.out.println("Number of items : " + numOfItems);
        System.out.println("Net price of single product: "+ netPrice);
        System.out.println("VAT % : "+ vat +" %");
        System.out.println("Total VAT value : " + vatVal);
        System.out.println("Total net price : " + totalNet);
        return "";
    }
}
