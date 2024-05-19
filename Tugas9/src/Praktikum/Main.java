package Tugas9.src.Praktikum;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Laptop", 1, 1000),
            new Invoice("Mouse", 2, 25)
        };

        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Isri Haq", 4000, invoices, "Permanent ID", "Office 121");
        InternEmployee internEmployee = new InternEmployee(2, "Amirul Haq", 2500, invoices, "Intern ID", "Desk 111", 6);

        System.out.println("Detail Karyawan Tetap:");
        permanentEmployee.showEmployeeDetails();
        permanentEmployee.showInvoicesDetails();
        permanentEmployee.uniqueMethod1();
        permanentEmployee.uniqueMethod2();
        permanentEmployee.abstractMethod();

        System.out.println("\nDetail Karyawan Magang:");
        internEmployee.showEmployeeDetails();
        internEmployee.showInvoicesDetails();
        internEmployee.uniqueMethod3();
        internEmployee.uniqueMethod4();
        internEmployee.abstractMethod();
        internEmployee.attendTraining();
        internEmployee.trackContract();

        Employee.staticMethod();
    }
}