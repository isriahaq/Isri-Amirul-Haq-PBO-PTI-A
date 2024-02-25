import java.io.*;

public class SistemInformasi {
    public static void main(String[] args) {
        String[] data = new String[10];

        // Membaca data dari file
        try {
            BufferedReader baca = new BufferedReader(new FileReader("data.txt"));
            String baris;
            int indeks = 0;
            while ((baris = baca.readLine()) != null) {
                data[indeks++] = baris;
            }
            baca.close();
        } catch (IOException e) {
            System.out.println("File tidak ditemukan atau tidak dapat dibaca.");
        }

        // Memproses menu
        boolean proses = true;
        while (proses) {
            // Memanggil method tampilanMenu
            tampilanMenu();
            System.out.print("Pilih menu: ");
            try {
                BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
                int pilihan = Integer.parseInt(baca.readLine());

                switch (pilihan) {
                    case 1:
                        tampilanData(data);
                        break;
                    case 2:
                        System.out.print("Masukkan data baru: ");
                        String newData = baca.readLine();
                        tambahData(data, newData);
                        break;
                    case 3:
                        System.out.print("Masukkan kata kunci untuk pencarian: ");
                        String kataKunci = baca.readLine();
                        boolean hasilPencarian = cariData(data, kataKunci, 0);
                        if (hasilPencarian) {
                            System.out.println("Data ditemukan!");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                        break;
                    case 4:
                        // Menulis data ke file sebelum keluar
                        try {
                            BufferedWriter menulis = new BufferedWriter(new FileWriter("data.txt"));
                            for (String datum : data) {
                                if (datum != null) {
                                    menulis.write(datum + "\n");
                                }
                            }
                            menulis.close();
                        } catch (IOException e) {
                            System.out.println("File tidak dapat ditulis.");
                        }
                        proses = false;
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input tidak valid.");
            }
        }
        System.out.println("Terima kasih!");
    }

    // Method untuk menampilkan menu
    public static void tampilanMenu() {
        System.out.println("=========== SISTEM INFORMASI ===========");
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Keluar");
        System.out.println("========================================");
    }

    // Method untuk menampilkan data
    public static void tampilanData(String[] data) {
        System.out.println("Data yang tersimpan:");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + ". " + data[i]);
        }
    }

    // Method untuk menambah data
    public static void tambahData(String[] data, String newData) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = newData;
                System.out.println("Data  berhasil ditambahkan!");
                return;
            }
        }
        System.out.println("Maaf, ruang penyimpanan anda penuh!");
    }

    // Method rekursif untuk mencari data
    public static boolean cariData(String[] data, String keyword, int indeks) {
        if (indeks >= data.length) {
            return false;
        }
        if (data[indeks] != null && data[indeks].equalsIgnoreCase(keyword)) {
            return true;
        }
        return cariData(data, keyword, indeks + 1);
    }
}
