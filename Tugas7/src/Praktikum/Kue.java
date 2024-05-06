package Tugas7.src.Praktikum;

// Abstract class Kue
abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk atribut harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk atribut harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Abstract method
    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga;
    }
}
