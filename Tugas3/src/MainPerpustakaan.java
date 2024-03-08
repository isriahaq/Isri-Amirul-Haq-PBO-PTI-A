import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Perpustakaan perpus = new Perpustakaan();
        int pilihan;

        do {
            System.out.println("======== Menu ========");
            System.out.println("1. Tambahkan buku");
            System.out.println("2. Hapus buku");
            System.out.println("3. Tambah anggota");
            System.out.println("4. Hapus anggota");
            System.out.println("5. Cari buku");
            System.out.println("6. keluar");
            System.out.print("Silahkan pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                Buku buku = new Buku();
                System.out.print("Judul buku: ");
                buku.setJudul(in.next());
                System.out.print("Penulis: ");
                buku.setPenulis(in.next());
                System.out.print("Tahun terbit: ");
                buku.setTahunTerbit(in.nextInt());
                perpus.tambahBuku(buku);               
                break;

                case 2:
                System.out.print("Masukkan ID buku yang mau di hapus: ");
                int idBuku = in.nextInt();
                perpus.hapusBuku(idBuku);
                break;

                case 3:
                AnggotaPerpustakaan  anggota = new AnggotaPerpustakaan();
                System.out.print("Nama: ");
                anggota.setNama(in.next());
                System.out.print("Alamat: ");
                anggota.setAlamat(in.next());
                System.out.print("ID Anggota: ");
                anggota.setIdAnggota (in.nextInt());
                perpus.tambahAnggota(anggota);
                break;

                case 4:
                System.out.print("Masukkan ID anggota yang mau di hapus: ");
                int idAnggota = in.nextInt();
                perpus.hapusAnggota(idAnggota);
                break;

                case 5:
                System.out.print(" Masukkan judul buku yang anda cari: ");
                String judulCari=in.next();
                Buku bukuDitemukan = perpus.cariBuku (judulCari);
                if (bukuDitemukan != null) {
                    System.out.println("Buku ditemukan");
                    System.out.println("Judul: " + bukuDitemukan.getJudul());
                    System.out.println("Penulis: " + bukuDitemukan.getPenulis());
                    System.out.println("Tahun terbit: " + bukuDitemukan.getTahunTerbit());
                    
                }else{
                    System.out.println("Buku tidak  ditemukan");
                }
                break;

                case 6:
                System.out.println ("Keluar dari program");
                break;
            
                default:
                System.out.println("Pilihan anda tidak valid");
                    break;
            }
        } while (pilihan != 6);

        in.close();
        
    }
}
