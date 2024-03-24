package Tugas4.Lanjutan;

public class AnggotaPerpustakaan {
    private String nama;
    private String alamat;
    private int idAnggota;

    // Constructor overload 1
    public AnggotaPerpustakaan() {
        this.nama = "Bochi JR";
        this.alamat = "Malang";
        this.idAnggota = 0;
    }

    // Constructor overload 2
    public AnggotaPerpustakaan(String nama, int idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.alamat = "Malang";
    }

    // Constructor overload 3
    public AnggotaPerpustakaan(String nama, String alamat, int idAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.idAnggota = idAnggota;
    }

    // Method overload 1
    public void pinjamBuku() {
        System.out.println("Anggota " + nama + " telah meminjam buku.");
    }

    // Method overload 2
    public void pinjamBuku(int bukuId) {
        System.out.println("Anggota " + nama + " telah meminjam buku dengan ID " + bukuId);
    }

    // Method overload 3
    public void pinjamBuku(String judulBuku) {
        System.out.println("Anggota " + nama + " telah meminjam buku dengan judul " + judulBuku);
    }

    // Method instans yang mengembalikan tipe data class itu sendiri
    public AnggotaPerpustakaan getAnggota() {
        return this;
    }

    // Getter and setter methods
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }
}
