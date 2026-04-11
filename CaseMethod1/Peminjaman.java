package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs = new Mahasiswa();

    Buku buku = new Buku();

    int lamaPinjam, batasPinjam = 5, terlambat, denda;

    Peminjaman() {

    }

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        denda = 2000 * ((lamaPinjam - batasPinjam > 0) ? lamaPinjam - batasPinjam : 0);
    }

    void tampilPeminjaman() {

        hitungDenda();

        System.out.println(mhs.nama + " | " + buku.judul + " | Lama : " + lamaPinjam + " | Terlambat : " +
                ((lamaPinjam - batasPinjam > 0) ? lamaPinjam - batasPinjam : 0) + " | Denda : " + denda);
    }

    Peminjaman[] insertionSort(Peminjaman pinjam[], String berdasarkan) {

        Peminjaman[] pinjamTemp = new Peminjaman[pinjam.length];

        // MEMASUKKAN INFORMASI ARRAY TERBARU KE PENYIMPANAN SEMENTARA UNTUK DI-SORT
        for (int i = 0; i < pinjamTemp.length; i++) {
            pinjamTemp[i] = new Peminjaman();

            pinjamTemp[i].mhs = pinjam[i].mhs;
            pinjamTemp[i].buku = pinjam[i].buku;
            pinjamTemp[i].lamaPinjam = pinjam[i].lamaPinjam;

            pinjam[i].hitungDenda();
            pinjamTemp[i].denda = pinjam[i].denda;
        }

        // SORTING DIMULAI DISINI (INSERTION SORT)
        for (int i = 1; i < pinjamTemp.length; i++) {

            Peminjaman keyObject = pinjamTemp[i];

            int key = 0;
            int j = i - 1;

            if (berdasarkan.equalsIgnoreCase("denda")) {
                key = pinjamTemp[i].denda;

                while (j >= 0 && pinjamTemp[j].denda < key) {
                    pinjamTemp[j + 1] = pinjamTemp[j];
                    j--;
                }
            } else if (berdasarkan.equalsIgnoreCase("nim")) {
                key = Integer.parseInt(pinjamTemp[i].mhs.nim);

                while (j >= 0 && Integer.parseInt(pinjamTemp[j].mhs.nim) > key) {
                    pinjamTemp[j + 1] = pinjamTemp[j];
                    j--;
                }
            }

            pinjamTemp[j + 1] = keyObject;
        }

        return pinjamTemp;

    }

    void binarySearch(Peminjaman[] pinjam, String key) { // JIKA ADA, LANGSUNG TAMPILKAN

        Peminjaman listPinjam = new Peminjaman();

        // PROSES SORTING BERDASARKAN NIM
        pinjam = listPinjam.insertionSort(pinjam, "nim");

        // BINARY SEARCH MULAI DISINI
        int i = 0, j = pinjam.length - 1;
        Boolean counter = false;

        while (i <= j) {
            int m = (i + j) / 2;

            if (pinjam[m].mhs.nim.equals(key)) {
                System.out.println();
                pinjam[m].tampilPeminjaman();
                counter = true;
                break;

            } else if (Integer.parseInt(key) > Integer.parseInt(pinjam[m].mhs.nim)) {
                i = m + 1;

            } else {
                j = m - 1;

            }
        }

        if (!counter) {
            System.out.println("NIM tidak ditemukan!");
        }
    }

}
