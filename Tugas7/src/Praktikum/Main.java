package Tugas7.src.Praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array kue
        Kue[] kueArray = new Kue[20];
        for (int i = 0; i < 10; i++) {
            kueArray[i] = new KuePesanan("Kue Pesanan " + i, 10.0 + i, i + 1);
        }
        for (int i = 10; i < 20; i++) {
            kueArray[i] = new KueJadi("Kue Jadi " + i, 10.0 + i, i + 1);
        }

        Menu menu = new Menu(kueArray);
        menu.displayMenu(scanner);

        scanner.close();
    }
}
