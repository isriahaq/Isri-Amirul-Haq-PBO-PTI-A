public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    public double waktu;
    public double sekon;
    public double ubahSatuanKecepatan;
    public double jarak;
    public double kecepatanPublic;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setWaktu(double inputWaktu) {
        waktu = inputWaktu;
        rubahSekon(waktu);
        System.out.println("Waktu dalam jam adalah " + waktu + " jam");
    }

    private void rubahSekon(double inputWaktu) {
        sekon = 3600 * inputWaktu;
        System.out.println("Waktu menjadi " + sekon + " sekon");
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        kecepatanPublic = i;
        rubahKecepatan(kecepatan);
    }

    private void rubahKecepatan(double inputKecepatan) {
        ubahSatuanKecepatan = (inputKecepatan * 1000) / 3600;
        System.out.println("Kecepatan anda dalam m/s menjadi " + ubahSatuanKecepatan + " m/s");
    }

    public void hitungJarak() {
        jarak = ubahSatuanKecepatan * sekon;
        System.out.println("Jarak tempuh mobil adalah " + jarak + "m");
    }

    public double hitungJarakKm() {
        return kecepatanPublic * waktu;
    }

    public void displayMassage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("Jarak yang ditempuh mobil adalah " + hitungJarakKm() + " km");
    }
}
