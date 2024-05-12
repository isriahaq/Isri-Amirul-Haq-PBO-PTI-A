package Praktikum;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return getUpah();
    }
    
    @Override
    public String toString() {
        return "Pegawai Tetap    : " + this.getNama() + 
                "\nNo. KTP          : " + this.getNoKTP() +
                "\nUpah             : Rp " + this.getUpah() + 
                "\nPendapatan       : Rp " + this.gaji();
    }
}
