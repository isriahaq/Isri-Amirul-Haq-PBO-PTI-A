package Tugas7.src.AnalisisPercobaan;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthDate; // Tanggal lahir

    // public Employee(String name, String noKTP) {
    //     this.name = name;
    //     this.noKTP = noKTP;
    // }

    // no 4
    public Employee(String name, String noKTP, LocalDate birthDate) {
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    // aksesor
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // mutator
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // public String toString() {
    //     return String.format("Name: %s\nNo. KTP: %s", getName(), getNoKTP());
    // }

    // no 4
    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), getBirthDate());
    }

    public abstract double earnings(); // pendapatan

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == birthDate.getMonthValue() && today.getDayOfMonth() == birthDate.getDayOfMonth();
    }

    public double calculateSalary() {
        double baseSalary = earnings();
        if (isBirthday()) {
            baseSalary += 100000; // Menambah gaji jika hari ulang tahun
        }
        return baseSalary;
    }
}
