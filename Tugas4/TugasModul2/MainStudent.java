package Tugas4.Bab2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        // no 4, dapat memasukkan jumlah siswa sesuai dengan keinginan pengguna dengan 
        // inputan yang interaktif dan menggunakan array
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline character
        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Data siswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Alamat: ");
            String address = scanner.nextLine();
            System.out.print("Umur: ");
            int age = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            double math = scanner.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double english = scanner.nextDouble();
            System.out.print("Nilai IPA: ");
            double science = scanner.nextDouble();

            students[i] = new Student(name, address, age, math, english, science);
            scanner.nextLine();
        }

        // Menampilkan data siswa
        System.out.println("\nData Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            students[i].displayMessage();
            System.out.println();
        }
        scanner.close();

        // no 5, memanggil method jumlahObjek()
        // Student.jumlahObjek();



        // Student anna = new Student();

        // no 2, penggunaan constructor baru pada main class:
        // Student isri = new Student("isri", "Lombok", 19, 95, 90, 90);
        // isri.displayMessage();
        // System.out.println("===================");

        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();

        // // menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();

        // //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        // System.out.println("===================");
        // anna = new Student("anna", "Batu", 18); // sebelumnya bermasalah karena s pada student kecil
        // anna.displayMessage();

        // //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();
    }
}
