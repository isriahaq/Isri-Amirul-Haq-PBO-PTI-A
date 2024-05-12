package Praktikum;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Bayu", "35072849032742409342", 2000000);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Edo", "35072849032742409343", 8500, 40);
        Sales sales = new Sales("Tika", "35072849032742409344", 50, 50000);

        // upcasting
        Pegawai pegawai1 = pegawaiTetap;
        System.out.println(pegawai1.toString()); 
        Pegawai pegawai2 = pegawaiHarian;
        System.out.println(pegawai2.toString()); 
        Pegawai pegawai3 = sales;
        System.out.println(pegawai3.toString()); 

        // downcasting
        // PegawaiTetap pegawaiTetapDowncast = (PegawaiTetap) pegawai1;
        // System.out.println(pegawaiTetapDowncast.toString()); 
        // PegawaiHarian pegawaiHarianDowncast = (PegawaiHarian) pegawai2;
        // System.out.println(pegawaiHarianDowncast.toString());
        // Sales salesDowncast = (Sales) pegawai3;
        // System.out.println(salesDowncast.toString());
    }
}
