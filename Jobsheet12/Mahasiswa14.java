package Jobsheet12;

public class Mahasiswa14 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(
            "\nNIM        : " + nim +
            "\nNama       : " + nama +
            "\nKelas      : " + kelas +
            "\nIPK        : " + ipk
        );
    }
}
