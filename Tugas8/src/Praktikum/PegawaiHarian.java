package Praktikum;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }
    
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJamKerja) {
        this.totalJam = totalJamKerja;
    }

    @Override
    public double gaji() {
        if (getTotalJam() <= 40) {
            return getUpahPerJam() * getTotalJam();
        } else {
            return (40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5);
        }
    }
    
    @Override
    public String toString() {
        return "\nPegawai Harian   : " + this.getNama() + 
                "\nNo. KTP          : " + this.getNoKTP() +
                "\nUpah/jam         : Rp " + this.getUpahPerJam() + 
                "\nTotal jam kerja  : " + this.getTotalJam() +
                "\nPendapatan       : Rp " + this.gaji();
    }
}
