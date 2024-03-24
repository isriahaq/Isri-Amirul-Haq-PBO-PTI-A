package Tugas4.Bab2;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    // no 5
    private static int banyakObjek = 0;

    // no 1, sebelumnya "public student()"
    public Student(){    
    name = "";
    address = "";
    age = 0;
    }

    // no 2, menambahkan constructor pada class Student dengan parameter untuk masing-masing nilai dari mata pelajaran yang ada
    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;

        // no 5
        banyakObjek++;
    }

    // no 3, method yang mengembalikan nilai bolean untuk menentukan apakah siswa tersebut remidi atau tidak
    public boolean statusAkhir() {
        double average = getAverage();
        return average >= 61;
    }
    
    // no 5
    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang telah dibuat: " + banyakObjek);
    }
    

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    // Display sebelumnya
    // public void displayMessage() {
    //     System.out.println("Siswa dengan nama " + name);
    //     System.out.println("beramalat di " + address);
    //     System.out.println("berumur " + age);
    //     System.out.println("mempunyai nilai rata rata " + getAverage());
    // }

    // Display baru
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("Status: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }    
}
