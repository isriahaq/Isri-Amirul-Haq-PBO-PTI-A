package Tugas9.src.Praktikum;

public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void showEmployeeDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Nomor pendaftaran: " + registrationNumber);
        System.out.println("Gaji per Bulan: " + salaryPerMonth);
        System.out.println("Total Gaji setelah dipotong: " + getPayableAmount());
    }

    public void showInvoicesDetails() {
        for (Invoice invoice : invoices) {
            invoice.showInvoiceDetails();
        }
    }

    public void commonMethod() {
        System.out.println("Ini commonMethod di Employee");
    }

    protected abstract void abstractMethod();

    public static void staticMethod() {
        System.out.println("Ini staticMethod di Employee");
    }
}
