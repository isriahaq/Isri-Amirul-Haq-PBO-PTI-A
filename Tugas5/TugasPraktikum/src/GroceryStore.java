package Tugas5.Praktikum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Customer {
    private String customerNumber;
    private String name;
    private double balance;
    private int pin;
    private int loginAttempts;

    public Customer(String customerNumber, String name, double balance, int pin) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.loginAttempts = 0;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean authenticate(int pin) {
        if (this.pin == pin) {
            loginAttempts = 0;
            return true;
        } else {
            loginAttempts++;
            if (loginAttempts >= 3) {
                System.out.println("Akun terkunci. Silakan menghubungi layanan pelanggan.");
            } else {
                System.out.println("Ups maaf pin salah! Coba lagi: " + (3 - loginAttempts));
            }
            return false;
        }
    }

    public void topUp(double amount) {
        balance += amount;
        System.out.println("Top-up berhasil. Saldo baru: Rp" + balance);
    }

    public boolean purchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            if (balance >= 10000) {
                System.out.println("Pembelian berhasil. Saldo tersisa: Rp" + balance);
                return true;
            }else {
                System.out.println("Saldo tidak boleh di bawah 10.000");
                return false;
            }
        } else {
            System.out.println("Saldo tidak mencukupi. Pembelian gagal.");
            return false;
        }
    }

    public void applyCashback(double amount) {
        balance += amount;
        System.out.println("Cashback diterapkan. Saldo baru: Rp" + balance);
    }
}

public class GroceryStore {
    private static Map<String, Customer> customers = new HashMap<>();

    public static void main(String[] args) {
        initializeCustomers();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Toko Kelontong Mini!");

        while (true) {
            System.out.print("Masukkan nomor pelanggan: ");
            String customerNumber = scanner.next();

            if (!customers.containsKey(customerNumber)) {
                System.out.println("Pelanggan tidak ditemukan. Silakan coba lagi.");
                continue;
            }

            Customer customer = customers.get(customerNumber);

            System.out.print("Masukkan PIN: ");
            int pin = scanner.nextInt();

            if (!customer.authenticate(pin)) {
                continue;
            }

            System.out.println("Halo, " + customer.getName() + "!");

            System.out.println("1. Top-up");
            System.out.println("2. Purchase");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah top-up: Rp");
                    double topUpAmount = scanner.nextDouble();
                    customer.topUp(topUpAmount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pembelian: Rp");
                    double purchaseAmount = scanner.nextDouble();
                    processPurchase(customer, purchaseAmount);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Terima kasih telah berbelanja bersama kami!");
        }
    }

    private static void initializeCustomers() {
        customers.put("3800000001", new Customer("3800000001", "Isri", 300000, 123456));
        customers.put("5600000002", new Customer("5600000002", "Nana", 500000, 654321));
        customers.put("7400000003", new Customer("7400000003", "Dora", 8000000, 123123));
    }

    private static void processPurchase(Customer customer, double amount) {
        double cashbackPercentage;
        double cashbackAmount;

        String customerNumberPrefix = customer.getCustomerNumber().substring(0, 2);

        switch (customerNumberPrefix) {
            case "38":
                cashbackPercentage = (amount > 1000000) ? 0.05 : 0;
                break;
            case "56":
                cashbackPercentage = (amount > 1000000) ? 0.07 : 0.02;
                break;
            case "74":
                cashbackPercentage = (amount > 1000000) ? 0.10 : 0.05;
                break;
            default:
                cashbackPercentage = 0;
        }

        cashbackAmount = amount * cashbackPercentage;
        if (cashbackAmount > 0) {
            customer.applyCashback(cashbackAmount);
        }

        if (!customer.purchase(amount)) {
            System.out.println("Transaksi gagal. Silakan coba lagi.");
        }
    }
}
