package src.Analisis;

import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireday = calendar.getTime();
        // No 5. this merujuk pada data saat ini, namun dalam kasus ini adanya this tidak mempengaruhi 
        //       program karena tidak ada konflik nama variabel antara parameter dan variabel instance
    }

    // No 3 dan 6
    public Employee(String name){
        // this.name = name;
    }

    // No 8, ubh ke private dan protected
    public Date getHireDay() {
        return hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
