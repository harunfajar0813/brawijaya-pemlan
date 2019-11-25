package com.bab8.perusahaan;public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Product Name : " + productName +
                "\nQuantity : " + quantity +
                "\nPrice per Item : Rp. " + pricePerItem +
                "\nFinal Product Price : Rp. " + getPayableAmount();

    }
}
