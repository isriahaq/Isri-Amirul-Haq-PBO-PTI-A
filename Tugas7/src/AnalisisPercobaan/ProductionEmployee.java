package Tugas7.src.AnalisisPercobaan;

import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private double wagePerItem; // Upah per barang
    private int itemsProduced; // Jumlah barang yang diproduksi per minggu

    public ProductionEmployee(String name, String noKTP, LocalDate birthDate, double wagePerItem, int itemsProduced) {
        super(name, noKTP, birthDate);
        this.wagePerItem = wagePerItem;
        this.itemsProduced = itemsProduced;
    }

    public double getWagePerItem() {
        return wagePerItem;
    }

    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    public int getItemsProduced() {
        return itemsProduced;
    }

    public void setItemsProduced(int itemsProduced) {
        this.itemsProduced = itemsProduced;
    }

    @Override
    public double earnings() {
        return wagePerItem * itemsProduced;
    }

    @Override
    public String toString() {
        return String.format("Production Employee: %s\nWage per item: %.2f\nItems produced: %d", super.toString(), wagePerItem, itemsProduced);
    }
}
