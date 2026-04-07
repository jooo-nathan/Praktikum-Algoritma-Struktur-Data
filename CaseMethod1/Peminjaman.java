package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs = new Mahasiswa();

    Buku buku = new Buku();

    int lamaPinjam, batasPinjam = 5, terlambat, denda = 2000;

    Peminjaman() {

    }
    
    Peminjaman(Mahasiswa mahasiswa, Buku book, int lmPinjam) {
        mhs = mahasiswa;
        buku = book;
        lamaPinjam = lmPinjam;
    }

    void hitungDenda() {
        denda = denda * ((lamaPinjam-batasPinjam > 0) ? lamaPinjam-batasPinjam : 0);
    }

    void tampilPeminjaman() {
        hitungDenda();
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama : " + lamaPinjam + " | Terlambat : " +
        ((lamaPinjam-batasPinjam > 0) ? lamaPinjam-batasPinjam : 0) + " | Denda : " + denda);
    }

    void insertionSort(int key, Peminjaman pjm) {

    }

}
