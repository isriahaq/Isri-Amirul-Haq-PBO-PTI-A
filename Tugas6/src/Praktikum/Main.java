package src.Praktikum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia lakiMenikah = new Manusia("Naruto", true, "123456789", true);
        Manusia perempuanMenikah = new Manusia("Sakura", false, "987654321", true);
        Manusia belumMenikah = new Manusia("Sasuke", true, "456789123", false);

        System.out.println("Manusia:");
        System.out.println("a. " + lakiMenikah.toString());
        System.out.println("b. " + perempuanMenikah.toString());
        System.out.println("c. " + belumMenikah.toString());

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Ino", false, "165150600000001", false, "165150600000001", 2.8);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Choji", true, "165150600000002", false, "165150600000002", 3.2);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Shikamaru", true, "165150600000003", false, "165150600000003", 3.7);

        System.out.println("\nMahasiswa FILKOM:");
        System.out.println("a. " + mahasiswa1.toString());
        System.out.println("b. " + mahasiswa2.toString());
        System.out.println("c. " + mahasiswa3.toString());

        Pekerja pekerja1 = new Pekerja("Shino", true, "456123789", true, 5000, LocalDate.of(2019, 5, 1), 2);
        Pekerja pekerja2 = new Pekerja("Hinata", false, "789123456", true, 6000, LocalDate.of(2013, 9, 12), 0);
        Pekerja pekerja3 = new Pekerja("Kiba", true, "159753456", true, 8000, LocalDate.of(2004, 3, 20), 10);

        System.out.println("\nPekerja:");
        System.out.println("a. " + pekerja1.toString());
        System.out.println("b. " + pekerja2.toString());
        System.out.println("c. " + pekerja3.toString());

        Manager manager = new Manager("Lee", true, "456987123", true, 7500, LocalDate.of(2009, 8, 15), 2, "IT");

        System.out.println("\nManager:");
        System.out.println(manager.toString());
    }
}
