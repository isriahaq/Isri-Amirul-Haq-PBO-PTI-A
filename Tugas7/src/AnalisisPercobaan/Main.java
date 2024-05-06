package Tugas7.src.AnalisisPercobaan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // no 1
        // Employee employee = new Employee();

        // no 4, 5
        LocalDate birthday = LocalDate.of(1990, 5, 5); // Contoh tanggal lahir
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, birthday);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, birthday);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, birthday);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, birthday);

        // // no 4
        // Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};
        // for (Employee employee : employees) {
        // System.out.println(employee);
        // System.out.printf("Earnings: $%,.2f\n\n", employee.calculateSalary());
        // }

        // no 5 Tambahkan objek ProductionEmployee
        ProductionEmployee productionEmployee = new ProductionEmployee("Fadil", "678", birthday, 5.50, 1000);

        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee, productionEmployee};

        for (Employee employee : employees) {
        System.out.println(employee);
        System.out.printf("Earnings: $%,.2f\n\n", employee.earnings());
        }

        // no 2
        // SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        // HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        // CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        // BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, 04, 300);
        // System.out.println("Employees diproses secara terpisah:\n");
        // System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        // Employee[] employees = new Employee[4];
        // employees[0] = salariedEmployee;
        // employees[1] = hourlyEmployee;
        // employees[2] = commissionEmployee;
        // employees[3] = basePlusCommissionEmployee;

        // System.out.println("Employees diproses secara polimorfisme:\n");
        // for (Employee currentEmployee : employees) {
        //     System.out.println(currentEmployee);
        //     if (currentEmployee instanceof BasePlusCommissionEmployee) {
        //         BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
        //         employee.setBaseSalary(1.10 * employee.getBaseSalary());
        //         System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
        //     }
        //     System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        // }
        // for (int j = 0; j < employees.length; j++) {
        //     System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        // }
    }
}
