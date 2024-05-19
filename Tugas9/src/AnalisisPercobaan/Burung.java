package Tugas9.src.AnalisisPercobaan;

public class Burung implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Burung(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Burung makan biji-bijian");
    }

    @Override
    public void berjalan() {
        System.out.println("Burung bisa berjalan dan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berkicau merdu");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama burung saya: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur burung saya: " + this.umur + " tahun");
    }
}
