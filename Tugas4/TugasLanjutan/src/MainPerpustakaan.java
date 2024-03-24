package Tugas4.Lanjutan;

import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek anggota dengan constructor overload 1
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan();

        // Membuat objek anggota dengan constructor overload 2
        AnggotaPerpustakaan anggota2 = new AnggotaPerpustakaan("Isri", 123);

        // Membuat objek anggota dengan constructor overload 3
        AnggotaPerpustakaan anggota3 = new AnggotaPerpustakaan("Nana", "Jalan Merdeka No. 123", 456);

        // Memanggil method overloading dari objek anggota1
        anggota1.pinjamBuku();
        anggota1.pinjamBuku(789);
        anggota1.pinjamBuku("Harry Potter");
        System.out.println("=============================================");
        
        anggota2.pinjamBuku();
        anggota2.pinjamBuku(3241);
        anggota2.pinjamBuku("OOP");
        System.out.println("=============================================");
        
        anggota3.pinjamBuku();
        anggota3.pinjamBuku(42334);
        anggota3.pinjamBuku("Pemdas");
        System.out.println("=============================================");
        in.close();
    }
}
