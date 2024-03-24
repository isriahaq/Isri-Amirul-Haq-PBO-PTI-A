package Tugas4.Bab2;

public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        // System.out.println("R1.isRasional: " + R1.isRasional());
        // System.out.println("R2.isRasional: " + R1.isRasional()); 
        // System.out.println();
        
        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional()); 
        System.out.println();


        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        // no 2
        System.out.println("R1 < R2 : " + R1.kurangDari(R2));
        System.out.println("R1 <= R2 : " + R1.kurangDariAtauSamaDengan(R2));
        System.out.println("R1 >= R2 : " + R1.lebihBesarDariAtauSamaDengan(R2));
        System.out.println();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        R1.Sederhana();
        R2.Sederhana();
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();


        // no 4
        Rasional R3 = new Rasional(1, 4); // 1/4
        Rasional R4 = new Rasional(2, 3); // 2/3

        Rasional hasilKurang = R3.subtract(R4);
        System.out.print("Hasil pengurangan R3 - R4 : ");
        hasilKurang.cetak();

        Rasional hasilKali = R3.multiply(R4);
        System.out.print("Hasil perkalian R3 * R4 : ");
        hasilKali.cetak();

        Rasional hasilBagi = R3.divide(R4);
        System.out.print("Hasil pembagian R3 / R4 : ");
        hasilBagi.cetak();
    }
}
