package Tugas7.src.Praktikum;

import java.util.Scanner;

class Menu {
    private Kue[] kueArray;

    public Menu(Kue[] kueArray) {
        this.kueArray = kueArray;
    }

    public void displayMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua kue dan harus ditampilkan jenis kuenya");
            System.out.println("2. Hitung total harga yang didapat dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga (harga akhir) terbesar");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tampilkanSemuaKue();
                    break;
                case 2:
                    hitungTotalHargaSemuaKue();
                    break;
                case 3:
                    hitungTotalHargaTotalBeratKuePesanan();
                    break;
                case 4:
                    hitungTotalHargaTotalJumlahKueJadi();
                    break;
                case 5:
                    tampilkanKueDenganHargaTertinggi();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 6);
    }

    private void tampilkanSemuaKue() {
        System.out.println("\nSemua Kue:");
        for (Kue kue : kueArray) {
            System.out.println(kue.getClass().getSimpleName() + ": " + kue);
        }
    }

    private void hitungTotalHargaSemuaKue() {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHarga);
    }

    private void hitungTotalHargaTotalBeratKuePesanan() {
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);
    }    
    

    private void hitungTotalHargaTotalJumlahKueJadi() {
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
    }

    private void tampilkanKueDenganHargaTertinggi() {
        Kue kueDenganHargaTertinggi = kueArray[0];
        for (int i = 1; i < kueArray.length; i++) {
            if (kueArray[i].hitungHarga() > kueDenganHargaTertinggi.hitungHarga()) {
                kueDenganHargaTertinggi = kueArray[i];
            }
        }
        System.out.println("Kue dengan Harga Tertinggi: " + kueDenganHargaTertinggi);
    }
}
