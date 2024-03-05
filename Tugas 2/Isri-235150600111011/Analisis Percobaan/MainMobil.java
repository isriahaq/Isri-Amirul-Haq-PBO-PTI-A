import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        // instan objek bernama m1
        Mobil m1 = new Mobil();
        Scanner in = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("MOMO disini! apakah anda ingin mendaftarkan mobil Anda? \niya \ntidak");
            String jawab = in.nextLine();
            if (jawab.equals("iya")) {
                System.out.println("Hallo! MOMO disini... \nSilahkan masukkan data-data mobil anda...");
                
                System.out.print("Set kecepatan mobil anda: ");
                int kecepatan = in.nextInt();
                in.nextLine();
                m1.setKecepatan(kecepatan);

                System.out.print("Set manufaktur mobil anda: ");
                String manufaktur = in.nextLine();
                m1.setManufaktur(manufaktur);

                System.out.print("Set No Plat mobil anda: ");
                String noPlat = in.nextLine();
                m1.setNoPlat(noPlat);

                System.out.print("Set warna mobil anda: ");
                String warna = in.nextLine();
                m1.setWarna(warna);
                
                System.out.println();
                m1.displayMassage();
                System.out.println("===================");

                // instan objek baru bernama m2
                // Mobil m2 = new Mobil();
                // m2.setKecepatan(100);
                // m2.setManufaktur("Toyota");
                // m2.setNoPlat("AB 1234 EF");
                // m2.setWarna("Hitam");
                // m2.displayMassage();
                // System.out.println("===================");

                // merubah warna dari objek m1
                System.out.print("Ketik iya apabila anda ingin merubah warna mobil (m1) menjadi hijau: ");
                String jawabWarna = in.nextLine();
                if (jawabWarna.equals("iya")) {
                    System.out.println("mobil pada objek di rubah menjadi warna hijau");
                    m1.setWarna("Hijau");
                    System.out.println("===================");
                }

                m1.setWaktu(2.3);
                m1.hitungJarak();
                m1.displayMassage();
            } else if (jawab.equals("tidak")) {
                kondisi = false;
            } else {
                System.out.println("Kondisi tidak ditemukan, silahkan memilih antara iya atau tidak");
            }
        }

        in.close();
    }
}
