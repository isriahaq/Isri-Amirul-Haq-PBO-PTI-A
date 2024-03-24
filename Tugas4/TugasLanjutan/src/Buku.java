package Tugas4.Lanjutan;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // Constructor overload 1
    public Buku() {
        this.judul = "Judul Default";
        this.penulis = "Penulis Default";
        this.tahunTerbit = 0;
    }

    // Constructor overload 2
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = 0;
    }

    // Constructor overload 3
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method overload 1
    public void pinjamBuku() {
        System.out.println("Buku " + judul + " telah dipinjam.");
    }

    // Method overload 2
    public void pinjamBuku(int anggotaId) {
        System.out.println("Buku " + judul + " dipinjam oleh anggota dengan ID " + anggotaId);
    }

    // Method overload 3
    public void pinjamBuku(String namaAnggota) {
        System.out.println("Buku " + judul + " dipinjam oleh anggota " + namaAnggota);
    }

    // Method instans yang mengembalikan tipe data class itu sendiri
    public Buku getBuku() {
        return this;
    }

    // Getter and setter methods
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
}

