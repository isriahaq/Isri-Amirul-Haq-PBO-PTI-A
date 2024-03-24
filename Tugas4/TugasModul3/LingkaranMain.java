package Tugas4.Bab3;

public class LingkaranMain {
    public static void main(String[] args) {
        // Lingkaran bukan "lingkaran"
        Lingkaran l = new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        Lingkaran l2 = new Lingkaran(4, 10);
        l2.displayMessage();

        // no 3
        Lingkaran lString = new Lingkaran("3", "10");
        lString.displayMessage();
    }
}
