package Tugas5.Analisis;

public class TestVehicle1 {
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
        Vehicle1 vehicle = new Vehicle1(10000);

        // System.out.println("Add load(100kg) : " + (vehicle.load=500));
        // no 2, terjadi error karena load bersifat private
        // no 3, setelah di public pada Vehicle1, maka akan menampilkan "Add load(100kg) : 500.0"
        // no 4, setelah di protected pada Vehicle1, maka akan menampilkan "Add load(100kg) : 500.0"
        // no 5, setelah di default pada Vehicle1, maka akan menampilkan "Add load(100kg) : 500.0"

        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));

        // System.out.println("Add load(100kg) : " + (vehicle.load=500));
        // no 3, apabila program dijalankan, maka akan menampilkan "Add load(100kg) : 500.0"
        // no 4, apabila program dijalankan, maka akan menampilkan "Add load(100kg) : 500.0"
        // no 5, apabila program dijalankan, maka akan menampilkan "Add load(100kg) : 500.0"

        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
        System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
        System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");        
    }
}
