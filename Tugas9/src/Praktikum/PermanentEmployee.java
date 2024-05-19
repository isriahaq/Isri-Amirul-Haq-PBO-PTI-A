package Tugas9.src.Praktikum;

public class PermanentEmployee extends Employee {
    private String uniqueAttr1;
    private String uniqueAttr2;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String uniqueAttr1, String uniqueAttr2) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.uniqueAttr1 = uniqueAttr1;
        this.uniqueAttr2 = uniqueAttr2;
    }

    public void uniqueMethod1() {
        System.out.println("Ini method unik 1 di PermanentEmployee");
    }

    public void uniqueMethod2() {
        System.out.println("Ini method unik 2 di PermanentEmployee");
    }

    @Override
    protected void abstractMethod() {
        System.out.println("Ini abstractMethod di PermanentEmployee");
    }
}
