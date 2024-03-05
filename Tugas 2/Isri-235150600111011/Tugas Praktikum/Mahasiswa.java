public class Mahasiswa {
    public static void main(String[] args) {
        PerhitunganBuku isri = new PerhitunganBuku();
        isri.isiBuku = 50;
        isri.kataPerHari = 100;
        isri.banyakHari();
    }
}

class PerhitunganBuku {
    public int isiBuku;
    // 100 kata untuk 1/2 halaman buku (1 hari)
    // 1 halaman buku (2 hari)
    // 1 lembar ada 2 halaman (4 hari)
    public int kataPerHari; 
    public int banyakHari;

    public void banyakHari() {
        banyakHari = isiBuku * 4;
        System.out.println("Waktu yang dihabiskan dalam menulis buku itu adalah " + banyakHari + " hari");
    }
}
