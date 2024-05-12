package Praktikum;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int totalPenjualan) {
        this.penjualan = totalPenjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return getPenjualan() * getKomisi();
    }

    @Override
    public String toString() {
        return "\nSales            : " + this.getNama() + 
                "\nNo. KTP          : " + this.getNoKTP() + 
                "\nTotal Penjualan  : " + this.getPenjualan() + 
                "\nBesaran Komisi   : Rp " + this.getKomisi() + 
                "\nPendapatan       : Rp " + this.gaji();
    }
}
