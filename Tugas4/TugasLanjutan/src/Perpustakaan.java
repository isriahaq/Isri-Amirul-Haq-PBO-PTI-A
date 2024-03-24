package Tugas4.Lanjutan;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku;
    private List<AnggotaPerpustakaan> daftarAnggota;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void hapusBuku(int idBuku) {
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getJudul().equals(idBuku)) {
                daftarBuku.remove(i);
                break;
            }
        }
    }

    public void tambahAnggota(AnggotaPerpustakaan anggota) {
        daftarAnggota.add(anggota);
    }

    public void hapusAnggota(int idAnggota) {
        for (int i = 0; i < daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getIdAnggota() == idAnggota) {
                daftarAnggota.remove(i);
                break;
            }
        }
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                return buku;
            }
        }
        return null;
    }
}

