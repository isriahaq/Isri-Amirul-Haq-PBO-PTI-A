package Tugas9.src.Praktikum;

public class InternEmployee extends Employee implements Contract {
    private String uniqueAttr1;
    private String uniqueAttr2;
    private int duration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String uniqueAttr1, String uniqueAttr2, int duration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.uniqueAttr1 = uniqueAttr1;
        this.uniqueAttr2 = uniqueAttr2;
        this.duration = duration;
    }

    public void uniqueMethod3() {
        System.out.println("Ini method unik 3 di InternEmployee");
    }

    public void uniqueMethod4() {
        System.out.println("Ini method unik 4 di InternEmployee");
    }

    @Override
    protected void abstractMethod() {
        System.out.println("Ini abstractMethod di InternEmployee");
    }

    @Override
    public void attendTraining() {
        System.out.println("Menghadiri sesi pelatihan");
    }

    @Override
    public void trackContract() {
        System.out.println("Melacak durasi kontrak: " + duration + " bulan");
    }
}
