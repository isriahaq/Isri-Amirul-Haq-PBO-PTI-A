package Tugas9.src.Praktikum;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void showInvoiceDetails() {
        System.out.println("Nama produk: " + productName);
        System.out.println("Kualitas: " + quantity);
        System.out.println("Harga per item: " + pricePerItem);
        System.out.println("Total: " + getPayableAmount());
    }
}
