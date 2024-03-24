package Tugas4.Bab3;

public class Lingkaran {
    int alas, tinggi;

    // Before
    // public lingkaran(int alas){
    //     this.alas = alas;
    //     }

    // public lingkaran(int alas, int tinggi){
    //     this.alas = alas;
    //     this.tinggi = tinggi;
    //     }

    // Penulisan Class yang benar menggunakan "Lingkaran" bukan lingkaran
    public Lingkaran(int alas) {
        this.alas = alas;
    }

    // no2
    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // no 3
    public Lingkaran(String alas, String tinggi) {
        this.alas = parseToInt(alas);
        this.tinggi = parseToInt(tinggi);
    }

    private int parseToInt(String nilai) {
        return Integer.parseInt(nilai);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
