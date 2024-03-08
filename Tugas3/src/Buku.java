public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public String getJudul() {
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }

    public void setJudul (String judul){
        this.judul = judul;
    }
    public void setPenulis (String penulis){
        this.penulis = penulis;
    }
    public void setTahunTerbit (int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    public void pinjamBuku (int anggotaId){
        System.out.println("Buku " + judul + " dipinjam oleh anggota dengan id " + anggotaId);
    }
}
