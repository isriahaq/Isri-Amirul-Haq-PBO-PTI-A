package Tugas5.Analisis;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");

        // (before) menggunakan string padahal yang diinputkan adalah integer
        // s1.setMark("90"); 

        s1.setMark(90); // Menggunakan integer

        // System.out.println("s1Name is " + s1.setName());
        // System.out.println("s1Mark is " + s1.setMark());

        System.out.println("s1Name is " + s1.getName()); // Menggunakan getName()
        System.out.println("s1Mark is " + s1.getMark()); // Menggunakan getMark()
        
        // System.out.println("name dan mark " + name + " " + mark);
        System.out.println("name dan mark " + s1.getName() + " " + s1.getMark());
    }
}
