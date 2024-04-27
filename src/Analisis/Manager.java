package src.Analisis;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        // super(name, salary, year, month, day, bonus);
        // No 4, terjadi error
        bonus = 0;
    }
    // No 8, agar protected tidak eror maka yang diatas di hilangkan

    // No 3 dan 6
    // public Manager(String name){
    //     super(name);
    //     bonus = 0;
    // }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        // No 5
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

}
