package Praktikum07;

public class MahasiswaBerprestasi14 {

    Mahasiswa14[] listMhs = new Mahasiswa14[5];
    int idx;

    void tambah(Mahasiswa14 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {

        System.out.println("\n--------------------------------------");
        System.out.println("Menampilkan data seluruh mahasiswa");
        System.out.println("--------------------------------------");
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            listMhs[i].tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("\nData " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }
        else {
            System.out.println("\nData mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
