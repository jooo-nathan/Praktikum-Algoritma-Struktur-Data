package Jobsheet10.Tugas;

public class MahasiswaKRS {

    String nim, nama, prodi, kelas;
    static int totalInputMhs, max = 30;

    MahasiswaKRS() {
    }

    public MahasiswaKRS(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        totalInputMhs++;
    }

    public static boolean isFull() {
        if (totalInputMhs == max) {
            return true;
        }
        else {
            return false;
        }
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
