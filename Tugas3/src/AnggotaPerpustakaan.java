public class AnggotaPerpustakaan {
    private String nama;
    private String alamat;
    private int idAnggota;

    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public int  getIdAnggota() {
        return idAnggota;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setIdAnggota(int idAnggota){
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(int bukuId){
        System.out.println("Anggota " + nama + " dengan ID " + idAnggota + " telah meminjam buku dengan ID " + bukuId);
    }
}
